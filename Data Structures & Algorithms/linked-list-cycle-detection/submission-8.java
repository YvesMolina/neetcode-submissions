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
        if (head == null || head.next == null){
            return false;
        }
        ListNode left = head;
        ListNode right = head.next;
        while(right.next != null){
            if(left.val == right.val){
                return true;
            }
            left = left.next;
            right = right.next.next;
        }
        return false;
    }
}
