/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        
        
        if (head == null || head.next == head) {
            return new Pair<>(head, null);
        }
        
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != head && fast.next.next != head)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node b = slow.next;
        slow.next = head;
        
        fast = b;
        
        
        while (fast.next != head) {
            fast = fast.next;
        }

        // Second half circular
        fast.next = b;
        
        
        // return <head , b >;
        return new Pair<>(head, b);
        
    }
}






