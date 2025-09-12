package linked_list;

public class _705_Design_HashSet {
    private boolean[] present;

    // Constructor
    public _705_Design_HashSet() {
        present = new boolean[1_000_001]; // key từ 0 đến 1_000_000
    }

    public void add(int key) {
        present[key] = true;
    }

    public void remove(int key) {
        present[key] = false;
    }

    public boolean contains(int key) {
        return present[key];
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        _705_Design_HashSet set = new _705_Design_HashSet();

        set.add(1);
        set.add(2);
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(3)); // false

        set.add(2);
        System.out.println(set.contains(2)); // true

        set.remove(2);
        System.out.println(set.contains(2)); // false
    }
    }
