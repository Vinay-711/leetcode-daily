# powx-n

[Original practice problem](https://leetcode.com/problems/powx-n/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using binary exponentiation (exponentiation by squaring). By breaking down the power n into powers of 2, we reduce the time complexity to O(log n) and space complexity to O(1). We handle the edge case of n = Integer.MIN_VALUE by converting n to a long to avoid overflow when taking the absolute value.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
