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
        if (head == null || head.next == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode left = dummy;
        left.next = head;
        int counter = 1;
        while(head != null && head.next != null){
            head = head.next;
            counter++;
        }
        counter = counter - n;
        if (counter == 0){
            return dummy.next.next;
        }
        while (left != null && left.next != null){
            left = left.next;
            counter--;
            if (counter == 0){
                left.next = left.next.next;
            }
        }
        return dummy.next;
    }
}
