# palindrome-partitioning-ii

[Original practice problem](https://leetcode.com/problems/palindrome-partitioning-ii/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming to solve this. First, we precompute a boolean table 'isPal' where isPal[i][j] is true if s[i..j] is a palindrome. Then, we use a DP array 'dp' where dp[i] represents the minimum cuts for the prefix s[0..i-1]. The time complexity is O(n^2) and space complexity is O(n^2).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
