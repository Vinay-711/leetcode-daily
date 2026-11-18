# unique-paths-ii

[Original practice problem](https://leetcode.com/problems/unique-paths-ii/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

This problem can be solved using dynamic programming. We define `dp[i][j]` as the number of unique paths to reach cell `(i, j)` from the top-left corner `(0,0)`. The robot can only move down or right. If a cell `(i, j)` contains an obstacle (`obstacleGrid[i][j] == 1`), then `dp[i][j]` is 0, as no paths can pass through it. Otherwise, `dp[i][j]` is the sum of paths from the cell directly above (`dp[i-1][j]`) and the cell directly to its left (`dp[i][j-1]`).

We first handle the base case: if the starting cell `(0,0)` itself is an obstacle, there are 0 paths, so we return 0 immediately. Otherwise, `dp[0][0]` is initialized to 1. Then, we fill the first row and first column: for any cell `(0, j)` or `(i, 0)`, if it's not an obstacle, the number of ways to reach it is the same as the number of ways to reach the cell immediately preceding it in that row/column. If an obstacle is encountered, all subsequent cells in that row/column become unreachable (0 paths).

Finally, we iterate through the rest of the grid (from `(1,1)` to `(m-1,n-1)`), applying the recurrence `dp[i][j] = dp[i-1][j] + dp[i][j-1]` if `obstacleGrid[i][j]` is not an obstacle. If it is an obstacle, `dp[i][j]` is set to 0. The result is `dp[m-1][n-1]`.

Time Complexity: O(m*n) as we iterate through each cell of the grid once.
Space Complexity: O(m*n) for the DP table. This can be optimized to O(n) by using only two rows or even one row, but O(m*n) is clear and well within limits for given constraints.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
