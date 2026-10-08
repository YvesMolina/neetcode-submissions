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
        ListNode turtle = head;
        ListNode hare = head.next;
        while (hare != null && hare.next != null){
            if (hare.next == turtle.next){
                return true;
            }
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return false;
    }
}
