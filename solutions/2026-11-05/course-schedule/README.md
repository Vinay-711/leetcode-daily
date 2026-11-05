# course-schedule

[Original practice problem](https://leetcode.com/problems/course-schedule/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is equivalent to detecting a cycle in a directed graph. I used Kahn's algorithm (Topological Sort using BFS). We calculate the in-degree of each node and use a queue to process nodes with an in-degree of 0. If the number of processed nodes equals numCourses, no cycle exists. Time complexity is O(V + E) and space complexity is O(V + E).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
