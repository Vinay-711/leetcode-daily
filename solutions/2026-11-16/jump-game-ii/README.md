# jump-game-ii

[Original practice problem](https://leetcode.com/problems/jump-game-ii/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a greedy approach to track the farthest point reachable within the current jump range. We maintain 'currentEnd' to mark the end of the current jump range and 'farthest' to track the maximum index reachable from any position visited so far. When we reach 'currentEnd', we increment the jump count and update 'currentEnd' to 'farthest'. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
