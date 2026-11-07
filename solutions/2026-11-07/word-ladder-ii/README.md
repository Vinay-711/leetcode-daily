# word-ladder-ii

[Original practice problem](https://leetcode.com/problems/word-ladder-ii/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using Breadth-First Search (BFS) to find the shortest distance from beginWord to all reachable words, followed by Depth-First Search (DFS) to reconstruct all paths that match the shortest distance. We use a Map to store the distance of each word from the beginWord and an adjacency list to store the graph structure. Time complexity is O(N * L^2 + V) where N is the number of words, L is word length, and V is the number of paths, and space complexity is O(N * L).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
