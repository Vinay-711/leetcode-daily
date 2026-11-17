# jump-game

[Original practice problem](https://leetcode.com/problems/jump-game/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a greedy approach by maintaining the furthest index reachable. We iterate through the array, updating the maximum reachable index at each step. If the current index exceeds the maximum reachable index, we return false. If the maximum reachable index reaches or exceeds the last index, we return true. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
