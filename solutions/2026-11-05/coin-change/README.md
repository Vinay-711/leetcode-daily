# coin-change

[Original practice problem](https://leetcode.com/problems/coin-change/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

This is a classic dynamic programming problem. We use a DP array 'dp' of size amount + 1, where dp[i] stores the minimum coins needed for amount i. We initialize dp[0] = 0 and all other values to amount + 1 (representing infinity). For each amount from 1 to amount, we iterate through all coins and update dp[i] = min(dp[i], dp[i - coin] + 1). The time complexity is O(amount * coins.length) and space complexity is O(amount).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
