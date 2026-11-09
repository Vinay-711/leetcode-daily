# convert-sorted-array-to-binary-search-tree

[Original practice problem](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To create a height-balanced BST from a sorted array, we recursively pick the middle element of the current range as the root. This ensures the left and right subtrees have roughly equal numbers of nodes. Time complexity is O(N) as we visit each element once, and space complexity is O(log N) due to the recursion stack depth.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
