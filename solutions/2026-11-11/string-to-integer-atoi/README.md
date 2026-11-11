# string-to-integer-atoi

[Original practice problem](https://leetcode.com/problems/string-to-integer-atoi/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution iterates through the string, skipping leading whitespace, identifying the sign, and then parsing digits while checking for overflow against Integer.MAX_VALUE and Integer.MIN_VALUE. Time complexity is O(n) where n is the length of the string, and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
