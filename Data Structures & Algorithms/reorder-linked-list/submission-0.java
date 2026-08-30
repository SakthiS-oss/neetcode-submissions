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

class Solution {
    public void reorderList(ListNode head) {
if (head == null || head.next == null) return;

        ListNode first = head;
        ListNode second = head.next;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

      
        ListNode curr = first.next;
        first.next = null;
        ListNode prev = null;
        
        while (curr != null) { 
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }


        ListNode p1 = head;
        ListNode p2 = prev;
        
        while (p2 != null) {
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;

            p1.next = p2;
            p2.next = tmp1;

            p1 = tmp1;
            p2 = tmp2;
        }
    }
}
