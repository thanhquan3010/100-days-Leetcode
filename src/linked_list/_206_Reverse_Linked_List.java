package linked_list;

public class _206_Reverse_Linked_List {
    //định nghĩa node
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    //đảo ngược danh sách
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next; //giữ node kế tiếp
            curr.next = prev; // đảo chiều
            prev = curr; // dịch prev lên
            curr = next; // dịch curr lên
        }
        return prev;
    }
    //in danh sách
    public static void printList(ListNode head) {
        ListNode tmp = head;
        while(tmp != null) {
            System.out.print(tmp.val);
            if (tmp.next != null) System.out.print(" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        head = reverseList(head);
        printList(head);
    }
}
