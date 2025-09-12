package linked_list;

public class _83_Remove_Duplicates_from_Sorted_List {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null) System.out.print(" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head){
            ListNode curr = head;
            while(curr != null && curr.next != null){
                if(curr.val == curr.next.val){
                    curr.next = curr.next.next;
                }else {
                    curr = curr.next;
                }
            }
            return head;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);

        // Tạo danh sách 1 -> 1 -> 2 -> 3 -> 3
        ListNode n5 = new ListNode(3);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode head = new ListNode(1, n2);

        head = deleteDuplicates(head);
        printList(head);
    }
}
