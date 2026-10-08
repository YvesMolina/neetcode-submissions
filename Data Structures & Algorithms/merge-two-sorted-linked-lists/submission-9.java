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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1 -> 1 -> 2 -> 3
        // if (list1.val > list2.val) -> res.next = list2.val;
        ListNode res = new ListNode();
        ListNode dummy = res;
        while(list1!=null && list2!=null){
            if (list1.val > list2.val){
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
            } else {
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
            }
        }
        dummy.next = list1 == null ? list2 : list1;
        return res.next;
    }
}