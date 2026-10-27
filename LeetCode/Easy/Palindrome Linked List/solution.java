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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp!= null)
        {
            temp = temp.next;
            length++;
        }
        temp = head;
        if(length == 1) return true;
        //if(length == 2 ) return false;
        int[] arr = new int[length];
        int k = 0;
        while(temp!=null)
        {
            arr[k++] = temp.val;
            temp = temp.next;  
        }

        for(int i = 0 , j = length -1 ; i < j; i++ , j--)
        {
                if(arr[i] != arr[j]) return false;
        }

        return true;
        
    }
}