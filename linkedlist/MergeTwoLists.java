/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null){
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode r = new ListNode();
        ListNode c = new ListNode();
        if(l1.val < l2.val) {
            r.next = l1;
            c = l1;
            l1 = l1.next;
        } else {
            r.next = l2;
            c = l2;
            l2 = l2.next;
        }

        while(l1 != null && l2 != null){
            if(l1.val < l2.val) {
                c.next = l1;
                c = c.next;
                l1 = l1.next;
            } else {
                c.next = l2;
                c = c.next;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            c.next = l1;
        }
        
        if(l2 != null){
            c.next = l2;
        }

        return r.next;
    }
}
