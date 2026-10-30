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
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         ArrayList<Integer> list = new ArrayList<>();
//         while(list1 != null)
//         {
//             list.add(list1.val);
//             list1 = list1.next;
//         }
//         while(list2 != null)
//         {
//             list.add(list2.val);
//             list2 = list2.next;
//         }
//         Collections.sort(list);




// //         ListNode head = null;
// //         ListNode tail = null;

// // for (int num : list) {
// //     ListNode newNode = new ListNode(num);

// //     if (head == null) {
// //         head = newNode;
// //         tail = newNode;
// //     } else {
// //         tail.next = newNode;
// //         tail = newNode;
// //     }
// // }

        
//     }
// }





class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> list = new ArrayList<>();

        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        ListNode head = null;

        for (int i = list.size() - 1; i >= 0; i--) {
            head = new ListNode(list.get(i), head);
        }

        return head;
    }
}
