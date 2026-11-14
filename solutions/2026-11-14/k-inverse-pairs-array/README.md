# k-inverse-pairs-array

[Original practice problem](https://leetcode.com/problems/k-inverse-pairs-array/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming where dp[i][j] represents the number of arrays of length i with j inverse pairs. The recurrence relation is dp[i][j] = sum(dp[i-1][j-x]) for 0 <= x < i. This can be optimized using a sliding window sum to O(n*k) time and O(k) space.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
