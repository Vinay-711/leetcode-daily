# dungeon-game

[Original practice problem](https://leetcode.com/problems/dungeon-game/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming starting from the bottom-right corner to the top-left. Let dp[i][j] be the minimum health required to enter room (i, j). The transition is dp[i][j] = max(1, min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j]). Time complexity is O(m*n) and space complexity is O(m*n) (can be optimized to O(n)).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
