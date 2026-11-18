# set-matrix-zeroes

[Original practice problem](https://leetcode.com/problems/set-matrix-zeroes/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

We use the first row and first column as markers for rows/columns that must become zero. Two booleans remember if the original first row/column contained a zero. After the first pass we zero rows and columns based on markers, then finally zero the first row/column if needed. Time O(m·n), extra space O(1).

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
