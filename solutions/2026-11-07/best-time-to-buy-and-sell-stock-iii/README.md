# best-time-to-buy-and-sell-stock-iii

[Original practice problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming to track four states: the cost of the first buy, the profit after the first sell, the cost of the second buy (reinvesting first profit), and the total profit after the second sell. We iterate through the prices once, updating these states. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
