# scramble-string

[Original practice problem](https://leetcode.com/problems/scramble-string/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using memoized recursion. For two strings to be scrambles of each other, they must have the same character counts. We recursively split s1 and s2 at every possible index i, checking if (s1[0..i] is a scramble of s2[0..i] AND s1[i..n] is a scramble of s2[i..n]) OR (s1[0..i] is a scramble of s2[n-i..n] AND s1[i..n] is a scramble of s2[0..n-i]). Time complexity is O(n^4) and space complexity is O(n^3) due to the memoization table.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
