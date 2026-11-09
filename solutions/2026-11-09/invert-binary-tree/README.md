# invert-binary-tree

[Original practice problem](https://leetcode.com/problems/invert-binary-tree/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using a recursive post-order traversal. For each node, we swap its left and right children and recursively call the function on both subtrees. Time complexity is O(n) where n is the number of nodes, and space complexity is O(h) where h is the height of the tree due to the recursion stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
