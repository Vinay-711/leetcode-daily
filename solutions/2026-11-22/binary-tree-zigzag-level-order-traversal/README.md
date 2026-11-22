# binary-tree-zigzag-level-order-traversal

[Original practice problem](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

The solution uses BFS (level order traversal) with a queue. A boolean flag tracks the direction of traversal (left-to-right or right-to-left). For each level, nodes are processed, and their values are collected. If the direction is right-to-left, the level's values are reversed. The direction flag is toggled after each level. Time complexity is O(n) as each node is processed once, and space complexity is O(n) for the queue and result list.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
