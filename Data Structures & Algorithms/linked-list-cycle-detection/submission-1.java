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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode temp = head;
        while(temp != null){
            if(hashSet.contains(temp)){ return true;}
            hashSet.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
