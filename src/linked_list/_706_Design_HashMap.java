package linked_list;

public class _706_Design_HashMap {

    // ===== Node cho danh sách liên kết =====
    static class Node {
        int key;
        int val;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    // ===== HashMap đơn giản =====
    static class MyHashMap {
        private Node[] map;

        public MyHashMap() {
            map = new Node[1000];
            // Dummy head để dễ chèn/xóa
            for (int i = 0; i < 1000; i++) {
                map[i] = new Node(-1, -1);
            }
        }

        public void put(int key, int value) {
            int hash = hash(key);
            Node cur = map[hash];

            while (cur.next != null) {
                if (cur.next.key == key) {
                    cur.next.val = value; // cập nhật nếu key đã tồn tại
                    return;
                }
                cur = cur.next;
            }
            cur.next = new Node(key, value); // chèn cuối
        }

        public int get(int key) {
            int hash = hash(key);
            Node cur = map[hash].next;

            while (cur != null) {
                if (cur.key == key) return cur.val;
                cur = cur.next;
            }
            return -1; // không tìm thấy
        }

        public void remove(int key) {
            int hash = hash(key);
            Node cur = map[hash];

            while (cur.next != null) {
                if (cur.next.key == key) {
                    cur.next = cur.next.next; // bỏ node cần xóa
                    return;
                }
                cur = cur.next;
            }
        }

        private int hash(int key) {
            return key % 1000;
        }
    }

    // ===== Hàm main test nhanh =====
    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();

        myMap.put(1, 10);
        myMap.put(2, 20);
        myMap.put(1001, 30); // collision với key 1 (hash=1)

        System.out.println("get(1) = " + myMap.get(1));     // 10
        System.out.println("get(2) = " + myMap.get(2));     // 20
        System.out.println("get(1001) = " + myMap.get(1001)); //
    }
}