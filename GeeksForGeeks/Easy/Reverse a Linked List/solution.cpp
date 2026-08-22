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
        Node temp = head;
        ArrayList <Node> arr = new ArrayList<>();
        
        while(temp != null)
        {
            arr.add(temp);
            temp = temp.next;
            
        }
        int n = arr.size();
        for(int i = n-1 ; i>=1 ; i--)
        {
            Node t1 = arr.get(i);
            Node t2 = arr.get(i-1);
            t1.next = t2;
            
        }
        arr.get(0).next = null;
        return arr.get(n-1);
    }
}