# longest-increasing-path-in-a-matrix

[Original practice problem](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using Depth First Search (DFS) with memoization. We define a memoization table 'cache' to store the longest increasing path starting from each cell (i, j). For each cell, we explore its four neighbors; if a neighbor has a strictly greater value, we recursively compute the path length. The time complexity is O(m * n) as each cell is computed once, and space complexity is O(m * n) for the cache.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
