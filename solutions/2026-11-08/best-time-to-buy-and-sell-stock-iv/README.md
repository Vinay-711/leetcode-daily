# best-time-to-buy-and-sell-stock-iv

[Original practice problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming with two arrays: buy[j] representing the maximum profit after buying the j-th stock, and sell[j] representing the maximum profit after selling the j-th stock. For each price, we update the buy and sell states for all k transactions. Time complexity is O(n*k) and space complexity is O(k).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
