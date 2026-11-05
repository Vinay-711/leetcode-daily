# wildcard-matching

[Original practice problem](https://leetcode.com/problems/wildcard-matching/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

Used dynamic programming with a 2D boolean array dp[s.length() + 1][p.length() + 1], where dp[i][j] indicates if s[0...i-1] matches p[0...j-1]. Time complexity is O(S * P) and space complexity is O(S * P).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
