# decode-ways

[Original practice problem](https://leetcode.com/problems/decode-ways/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming to count the number of ways to decode the string. Let dp[i] be the number of ways to decode the prefix of length i. For each position, we check if the single digit is valid (1-9) and if the two-digit number formed with the previous digit is valid (10-26). Time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
