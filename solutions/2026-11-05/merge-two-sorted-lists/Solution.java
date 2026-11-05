/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/merge-two-sorted-lists/
 * Generated: 2026-11-05 00:54:54
 *
 * Approach:
 * The approach uses an iterative method to merge the two sorted linked lists. A dummy head node is created to simplify the process of building the new list, especially handling the head. A 'current' pointer tracks the tail of the merged list. In each step, we compare the values of the current nodes from list1 and list2. The node with the smaller value is appended to the 'current.next', and then the corresponding list's pointer is advanced. The 'current' pointer is also advanced to the newly added node. This continues until one of the lists becomes empty. Finally, any remaining nodes from the non-empty list are appended to the end of the merged list. The head of the merged list is then returned as 'dummyHead.next'. This approach ensures the merged list remains sorted.
 * ==============================================================================
 */

class Solution {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy head node to simplify the logic of adding the first node
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead; // Pointer to the last node of the merged list

        // Iterate while both lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Append node from list1
                list1 = list1.next;   // Move list1 pointer forward
            } else {
                current.next = list2; // Append node from list2
                list2 = list2.next;   // Move list2 pointer forward
            }
            current = current.next; // Move current pointer to the newly added node
        }

        // If one list is exhausted, append the remaining nodes of the other list
        // This handles cases where one list is longer or initially empty.
        if (list1 != null) {
            current.next = list1;
        } else { // list2 != null or both are null (in which case current.next remains null)
            current.next = list2;
        }

        // The merged list starts from dummyHead.next
        return dummyHead.next;
    }
}
