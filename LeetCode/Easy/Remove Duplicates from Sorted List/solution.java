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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode temp = head;
        ListNode  tempNext = temp.next;
        while(temp != null  && temp.next != null)
        {
            tempNext = temp.next;

            if(temp.val == tempNext.val)
            {
                temp.next = tempNext.next;
            }
              else {
                temp = temp.next;
            }
        }
        return head;
        
    }
}