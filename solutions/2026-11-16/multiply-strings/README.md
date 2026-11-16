# multiply-strings

[Original practice problem](https://leetcode.com/problems/multiply-strings/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach uses the standard manual multiplication algorithm. Given two strings of lengths m and n, the product has at most m+n digits. We use an integer array of size m+n to store intermediate products at each position. We iterate backwards through both strings, multiplying digits and adding to the corresponding position in the array, handling carries. Finally, we convert the array to a string, skipping leading zeros. Time complexity is O(m*n) and space complexity is O(m+n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
