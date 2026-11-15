# valid-sudoku

[Original practice problem](https://leetcode.com/problems/valid-sudoku/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use three arrays of boolean arrays (or sets) to track the presence of digits 1-9 in each row, each column, and each 3x3 sub-box. We iterate through the 9x9 grid once. For each cell containing a digit, we calculate its row index, column index, and sub-box index (using (row/3)*3 + col/3). If the digit has already been seen in the corresponding row, column, or sub-box, we return false. Otherwise, we mark it as seen. Time complexity is O(1) since the board size is fixed at 81 cells, and space complexity is O(1) for the fixed-size tracking arrays.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
