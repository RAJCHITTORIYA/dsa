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
// class Solution {
//     public ListNode middleNode(ListNode head) {

//         ListNode curr = head;
//         int count = 0;
//         if((curr.next == null) || curr.next.next == null) return curr;

//         while(curr != null)
//         {
//             curr = curr.next;
//             count++;
//         }
//         curr = head;

//         int k = count/2 ;
//         while(curr != null)
//         {
//             curr = curr.next;
//             k--;
//             if(k == 0) return curr;
//         }
      
//         return head;
        
//     }
// }



class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
