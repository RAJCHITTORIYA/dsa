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
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp = head;
//         int length = 0;

//         while(temp!= null)
//         {
//             temp = temp.next;
//             length++;
//         }
//         temp = head;
//         if(length == 1) return true;
//         int[] arr = new int[length];
//         int k = 0;
//         while(temp!=null)
//         {
//             arr[k++] = temp.val;
//             temp = temp.next;  
//         }

//         for(int i = 0 , j = length -1 ; i < j; i++ , j--)
//         {
//             if(arr[i] != arr[j]) return false;
//         }

//         return true;
        
//     }
// }





class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Compare both halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}
