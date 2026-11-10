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

// The ListNode class definition is typically provided by the LeetCode environment.
// However, to address the 'cannot find symbol' error from the previous attempt,
// it's explicitly included here as a top-level class.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head node for the result list. This simplifies handling the head.
        ListNode dummyHead = new ListNode(0);
        // 'current' pointer will traverse and build the new list.
        ListNode current = dummyHead;
        // 'carry' stores any carry-over to the next digit.
        int carry = 0;

        // Loop continues as long as there are digits in either list or a carry exists.
        while (l1 != null || l2 != null || carry != 0) {
            // Get the value from l1, or 0 if l1 is exhausted.
            int val1 = (l1 != null) ? l1.val : 0;
            // Get the value from l2, or 0 if l2 is exhausted.
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of current digits and the carry.
            int sum = val1 + val2 + carry;
            // Update carry for the next iteration.
            carry = sum / 10;
            // The digit for the current node is the sum modulo 10.
            int digit = sum % 10;

            // Create a new node with the calculated digit and append it to the result list.
            current.next = new ListNode(digit);
            // Move the 'current' pointer to the newly added node.
            current = current.next;

            // Move to the next nodes in l1 and l2 if they exist.
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // The result list starts from dummyHead.next, as dummyHead itself is just a placeholder.
        return dummyHead.next;
    }
}