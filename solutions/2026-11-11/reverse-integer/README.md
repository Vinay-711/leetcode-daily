# reverse-integer

[Original practice problem](https://leetcode.com/problems/reverse-integer/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To reverse the integer without using 64-bit storage, we extract digits one by one using modulo and division. Before updating the result, we check for potential overflow by comparing the current result against Integer.MAX_VALUE/10 and Integer.MIN_VALUE/10. Time complexity is O(log10(x)) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
