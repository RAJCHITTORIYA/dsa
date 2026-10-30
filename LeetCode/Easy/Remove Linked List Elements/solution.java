// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode removeElements(ListNode head, int val) {

//         ListNode temp = head;
//         while(temp!= null)
//         {


//         }

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         ListNode curr = dummy;

//         while (curr.next != null) {

//             if (curr.next.val == val) {
//                 curr.next = curr.next.next;
//             } 
//             else {
//                 curr = curr.next;
//             }
//         }

//         return dummy.next;
//     }
// }




class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Remove matching nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } 
            else {
                temp = temp.next;
            }
        }

        return head;
    }
}

