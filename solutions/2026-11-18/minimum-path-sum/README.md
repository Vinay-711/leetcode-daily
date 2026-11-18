# minimum-path-sum

[Original practice problem](https://leetcode.com/problems/minimum-path-sum/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

We use dynamic programming to find the minimum path sum. We can modify the input grid in place to save space. For each cell (i, j), the minimum path sum to reach it is the value at the cell plus the minimum of the path sums from the top cell (i-1, j) and the left cell (i, j-1). Time complexity is O(m * n) and space complexity is O(1) auxiliary space.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
