# burst-balloons

[Original practice problem](https://leetcode.com/problems/burst-balloons/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem can be solved using dynamic programming. A key insight is to reverse the thinking: instead of considering which balloon to burst first, consider which balloon to burst *last* within a given subproblem. If we burst a balloon `k` last in a range `(i, j)`, it means all balloons to its left (`i+1` to `k-1`) and all balloons to its right (`k+1` to `j-1`) have already been burst. At the moment `k` is burst, its immediate neighbors are `i` and `j`. This allows us to define independent subproblems.

We first pad the original `nums` array with `1`s at both ends to handle boundary conditions (out-of-bounds neighbors are treated as `1`). Let the padded array be `newNums` of size `n+2`. `newNums[0]` and `newNums[n+1]` are `1`, and `newNums[1]` to `newNums[n]` are the original `nums` elements.

We define `dp[i][j]` as the maximum coins collected by bursting all balloons *strictly between* index `i` and index `j` in `newNums` (i.e., `newNums[i+1], ..., newNums[j-1]`). The balloons `newNums[i]` and `newNums[j]` are considered as unburst boundary balloons for this subproblem.

The base case is when `j = i + 1`, meaning there are no balloons between `i` and `j`, so `dp[i][i+1] = 0`.

The recurrence relation is:
`dp[i][j] = max(dp[i][j], dp[i][k] + dp[k][j] + newNums[i] * newNums[k] * newNums[j])`
for all `k` such that `i < k < j`. Here, `k` represents the balloon that is burst *last* in the range `(i, j)`. When `newNums[k]` is burst last, its value is multiplied by its current neighbors, `newNums[i]` and `newNums[j]`. The terms `dp[i][k]` and `dp[k][j]` represent the maximum coins from bursting the balloons in the left and right subproblems, respectively.

The computation proceeds by increasing the length of the interval `(j - i)`. The `len` variable iterates from `2` (for intervals containing one balloon) up to `n+1` (for the entire range of `n` original balloons).

Finally, `dp[0][n+1]` will contain the maximum coins from bursting all original balloons.

Time Complexity: O(N^3), where N is the number of balloons. This comes from three nested loops: one for interval length, one for the starting index `i`, and one for the splitting point `k`.
Space Complexity: O(N^2) for the `dp` table.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
