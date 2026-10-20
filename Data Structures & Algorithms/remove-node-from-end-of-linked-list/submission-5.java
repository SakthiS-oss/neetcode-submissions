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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode hare = head;
        ListNode tortoise = dummy;

        for(int i = 0; i < n; i++){hare = hare.next;}

        while(hare != null){
            hare = hare.next;
            tortoise = tortoise.next;
        }

        tortoise.next = tortoise.next.next;
        return dummy.next;

    }
}
