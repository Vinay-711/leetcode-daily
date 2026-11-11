# reconstruct-itinerary

[Original practice problem](https://leetcode.com/problems/reconstruct-itinerary/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using Hierholzer's algorithm to find an Eulerian path in a directed graph. We use a Map of PriorityQueues to store the adjacency list, ensuring that destinations are visited in lexicographical order. We perform a post-order DFS traversal, adding nodes to the result list only after all their outgoing edges have been visited, then reverse the list to get the correct itinerary. Time complexity is O(E log E) where E is the number of edges, due to PriorityQueue operations. Space complexity is O(V + E).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
