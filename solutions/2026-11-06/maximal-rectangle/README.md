# maximal-rectangle

[Original practice problem](https://leetcode.com/problems/maximal-rectangle/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved by treating each row as the base of a histogram. We maintain an array 'heights' representing the height of consecutive 1s ending at the current row. For each row, we calculate the largest rectangle in the histogram using a monotonic stack approach. Time complexity is O(rows * cols) and space complexity is O(cols).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
