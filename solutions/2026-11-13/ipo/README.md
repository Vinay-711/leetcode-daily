# ipo

[Original practice problem](https://leetcode.com/problems/ipo/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To maximize capital, we use a greedy approach. We store projects in a list sorted by their capital requirements. We use a max-priority queue to keep track of all projects we can currently afford. In each of the k steps, we add all affordable projects to the max-priority queue and pick the one with the highest profit. Time complexity is O(n log n + k log n) due to sorting and heap operations. Space complexity is O(n) to store the projects.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
