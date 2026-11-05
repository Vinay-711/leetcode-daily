/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Generated: 2026-11-05 11:16:19
 *
 * Approach:
 * We implement an iterative inorder traversal using an explicit stack (ArrayDeque). We traverse to the leftmost node, pushing each visited node onto the stack. When reaching a null, we pop a node from the stack, record its value, and move to its right subtree. Time Complexity: O(N) as each node is processed once. Space Complexity: O(H) where H is the height of the binary tree (O(N) worst case for a skewed tree).
 * ==============================================================================
 */

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }
}
