# excel-sheet-column-number

[Original practice problem](https://leetcode.com/problems/excel-sheet-column-number/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is equivalent to converting a base-26 number system to base-10, where 'A' corresponds to 1, 'B' to 2, ..., 'Z' to 26. We iterate through the string from left to right, maintaining a running total by multiplying the current total by 26 and adding the value of the current character (char - 'A' + 1). Time complexity is O(n) where n is the length of the string, and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
