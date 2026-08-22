/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        
        
        // Method -1 : Brute Force Method 
        
        // Node temp = head;
        // ArrayList <Node> arr = new ArrayList<>();
        
        // while(temp != null)
        // {
        //     arr.add(temp);
        //     temp = temp.next;
            
        // }
        // int n = arr.size();
        // for(int i = n-1 ; i>=1 ; i--)
        // {
        //     Node t1 = arr.get(i);
        //     Node t2 = arr.get(i-1);
        //     t1.next = t2;
            
        // }
        // arr.get(0).next = null;
        // return arr.get(n-1);
        
        
        // Method -2  three pointer method
        
        // Node prev = null;
        // Node curr = head;
        // Node fwd = null;
        // while( curr!= null)
        // {
        //     fwd = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = fwd;
        // }
        // return prev;
        
        
        // Method - 3 reverse recursively method
        
        if(head == null || head.next == null) return head;
        
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        
        
        
        a.next = head;
        return b;
        
        
    }
}