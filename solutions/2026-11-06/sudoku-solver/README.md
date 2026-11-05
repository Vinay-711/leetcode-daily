# sudoku-solver

[Original practice problem](https://leetcode.com/problems/sudoku-solver/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (62/62 testcases passed). Platform: **LeetCode**. Difficulty: **Hard**.

## Approach

Bitmask-optimized backtracking Sudoku solver. Maintains 9-bit masks for each row, column, and 3x3 block to check candidate validity in O(1). Time Complexity: O(9^(empty_cells)), Space: O(1) auxiliary bitmasks.

## Verification

Verified Accepted on LeetCode live judge (62/62 testcases passed).
