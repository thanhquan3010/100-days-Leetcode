package linked_list;

import java.util.LinkedList;

public class _203_Remove_Linked_List {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    // Hàm chính để xoá các node có giá trị val
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    // Hàm in danh sách
    public static void printList(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val);
            if (tmp.next != null) System.out.print(" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Tạo danh sách: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode((6));
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        printList(head);

        int val = 6;
        head = removeElements(head, val);
        printList(head);
    }
}
