# maximum-depth-of-binary-tree

[Original practice problem](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a recursive Depth-First Search (DFS) approach to compute the maximum depth of the binary tree. If the root node is null, the depth is 0. Otherwise, we recursively find the maximum depth of the left and right subtrees, and return 1 plus the maximum of the two depths. Time Complexity: O(N), where N is the number of nodes in the tree, as every node is visited once. Space Complexity: O(H), where H is the height of the binary tree, representing the recursion stack depth (O(N) worst-case for skewed trees, O(log N) for balanced trees).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
