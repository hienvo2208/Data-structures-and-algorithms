public class Solution {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = null; // dong vai tro con tro chay.
        ListNode pre = null; // Con tro phia truoc
        while(head!=null){
            tmp = head.next;
            head.next = pre;
            pre = head; // cập nhật lại pre
            head = tmp; // Cập nhật lại head .
        }
        return pre;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        reverseList(n1);
        printList(n5);

    }
}
