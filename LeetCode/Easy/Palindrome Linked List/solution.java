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
        ArrayList<ListNode> ans = new ArrayList<>();

        while(temp != null)
        {
            ans.add(temp);
            temp = temp.next;
        }
        int j = ans.size();

        int i = 0;
        while(i<j)
        {
            if(ans.get(i).val != ans.get(j-1).val)
            {
                return false;

            }
            i++;
            j--;

        }
       return true;
        
    }
}