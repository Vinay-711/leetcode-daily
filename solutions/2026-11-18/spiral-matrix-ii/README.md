# spiral-matrix-ii

[Original practice problem](https://leetcode.com/problems/spiral-matrix-ii/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

The approach simulates the spiral traversal by maintaining four boundary pointers: `rowStart`, `rowEnd`, `colStart`, and `colEnd`. Initially, these pointers define the outermost layer of the `n x n` matrix. We start filling the matrix with `currentNumber = 1` and increment it after each cell is filled.The algorithm proceeds in a loop as long as `rowStart <= rowEnd` and `colStart <= colEnd`. In each iteration, it performs four steps to fill one layer of the spiral:
1.  **Traverse Right**: Fill the top row from `colStart` to `colEnd` at `rowStart`. Then, increment `rowStart` to move the top boundary inwards.
2.  **Traverse Down**: Fill the rightmost column from `rowStart` to `rowEnd` at `colEnd`. Then, decrement `colEnd` to move the right boundary inwards.
3.  **Traverse Left**: Fill the bottom row from `colEnd` down to `colStart` at `rowEnd`. This step is executed only if `rowStart <= rowEnd` to prevent processing an already traversed row or out-of-bounds access when boundaries cross (e.g., for odd `n` or after previous steps). Then, decrement `rowEnd` to move the bottom boundary inwards.
4.  **Traverse Up**: Fill the leftmost column from `rowEnd` down to `rowStart` at `colStart`. This step is executed only if `colStart <= colEnd` for similar reasons as the left traversal. Then, increment `colStart` to move the left boundary inwards.
The loop terminates when the boundaries cross, indicating all cells have been filled.

Time Complexity: O(n^2), as each of the `n*n` cells in the matrix is visited and filled exactly once.
Space Complexity: O(n^2), for storing the `n x n` result matrix.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
