# count-and-say

[Original practice problem](https://leetcode.com/problems/count-and-say/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution uses an iterative approach to generate the sequence up to n. For each step, we perform run-length encoding on the previous string by iterating through it, counting consecutive identical characters, and appending the count and the character to a StringBuilder. Time complexity is O(2^n) in the worst case as the string length grows exponentially, and space complexity is O(2^n) to store the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
