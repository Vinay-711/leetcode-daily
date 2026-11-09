# excel-sheet-column-title

[Original practice problem](https://leetcode.com/problems/excel-sheet-column-title/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is equivalent to converting a base-10 number to a base-26 system, but with a twist: it uses 1-based indexing (A=1, ..., Z=26) instead of 0-based. To handle this, we decrement the columnNumber by 1 in each iteration before taking the modulo 26. This maps 1-26 to 0-25, allowing us to map them to 'A'-'Z'. Time complexity is O(log26(n)) and space complexity is O(log26(n)) to store the result string.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
