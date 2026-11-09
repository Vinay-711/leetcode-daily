# same-tree

[Original practice problem](https://leetcode.com/problems/same-tree/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We compare trees p and q recursively. If both nodes are null, the trees are identical at this point (return true). If only one node is null or their values do not match, the trees are not identical (return false). Otherwise, we recursively verify if both the left subtrees and right subtrees are identical.

Time Complexity: O(N) where N is the minimum number of nodes between both trees, as we visit each node at most once.
Space Complexity: O(H) where H is the height of the tree, corresponding to the recursion call stack depth.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
