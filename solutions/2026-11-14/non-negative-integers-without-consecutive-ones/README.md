# non-negative-integers-without-consecutive-ones

[Original practice problem](https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using digit DP. We represent n as a binary string. We use an array 'f' where f[i] is the number of binary strings of length i without consecutive ones (Fibonacci sequence). We iterate from the most significant bit to the least, counting valid numbers by checking if the current bit is 1. If we encounter consecutive ones, we stop counting as all subsequent numbers would violate the condition. Time complexity is O(log n), space complexity is O(log n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
