# binary-tree-maximum-path-sum

[Original practice problem](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a recursive post-order traversal to calculate the maximum path sum. For each node, we compute the maximum gain from its left and right subtrees (ignoring negative paths). The maximum path sum passing through a node is node.val + max(0, leftGain) + max(0, rightGain). We update a global variable with this value and return the maximum gain the node can contribute to its parent, which is node.val + max(0, max(leftGain, rightGain)). Time complexity is O(N) and space complexity is O(H) where H is the tree height.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
