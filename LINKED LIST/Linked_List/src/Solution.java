public class Solution {
//    public static ListNode removeElements(ListNode head, int val) {
//        ListNode x = head;
//        ListNode preNode = null;
//        while (x.next != null) {
//            if (x.val == val) {
//                head.next = x.next;
//            }else{
//                preNode = x;
//                x = x.next;
//                if (x.val == val) {
//                    preNode.next = x.next;
//                    if (x.next == null) break;
//                    x = x.next;
//                }
//            }
//        }
//        return head;
//    }

    //    public static ListNode removeElements(ListNode head, int val) {
//        if(head == null) return null;
//
//        ListNode newHead = null, curr = null;
//
//        ListNode temp = head;
//        while(temp != null) {
//            if(temp.val == val){
//                temp = temp.next;
//                continue;
//            }
//            ListNode newNode = new ListNode(temp.val);
//            if(newHead == null) {
//                newHead = newNode;
//            } else {
//                curr.next = newNode;
//            }
//            curr = newNode;
//            temp = temp.next;
//        }
//
//        return newHead;
//    }
//    public static ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//        ListNode preX = null;
//        ListNode x = head;
//        while (x != null) {
//            boolean xoaODau = false;
//            if (x.val == val) {
//                if (preX != null) {
//                    preX.next = x.next;
//
//                } else {
//                    head = x.next;
//                    xoaODau = true;
//                }
//            }
//            if (xoaODau == false && x.val != val) {
//                preX = x;
//            }
//            x = x.next;
//        }
//        return head;
//    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curNode = head;
        ListNode preNode = null;
        if (head == null) {
            return null;
        }
        while (curNode != null) {
            boolean check = false;
            if (curNode.val == val) {
                if (preNode != null) {
                    preNode.next = curNode.next;
                } else {
                    // preNode == null
                    head = curNode.next;
                    check = true;
                }
            }
            // Neu node do bi xoa, thi preNode van du nguyen.
            if (check == false && curNode.val != val) {
                preNode = curNode;
            }
            curNode = curNode.next;

        }
        return head;
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
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n1 = removeElements(n1, 2);
        printList(n1);


    }
}
