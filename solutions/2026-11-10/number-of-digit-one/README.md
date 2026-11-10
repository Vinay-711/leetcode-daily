# number-of-digit-one

[Original practice problem](https://leetcode.com/problems/number-of-digit-one/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach uses digit-by-digit counting based on place value. For each position (units, tens, hundreds, etc.), we calculate how many times the digit 1 appears by considering the digits to the left and right of the current position. Time complexity is O(log10(n)) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
