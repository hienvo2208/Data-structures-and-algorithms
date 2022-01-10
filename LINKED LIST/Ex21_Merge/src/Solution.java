public class Solution {
    // l1, ( node dau tien cua l1)
    // l2, ( node dau tien cua l2)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode mn = new ListNode();
         ListNode temp = mn;
         while(l1 != null && l2 != null){
             if(l1.val < l2.val){
                 temp.next =l1;
                 temp = temp.next;
                 l1 = l1.next;
             }
         }
         return null;
    }
}
