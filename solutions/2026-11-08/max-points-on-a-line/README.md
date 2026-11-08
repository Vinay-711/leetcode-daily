# max-points-on-a-line

[Original practice problem](https://leetcode.com/problems/max-points-on-a-line/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

For each point, calculate the slope to every other point. Use a HashMap to store the frequency of each slope. Since slopes can be represented as fractions (dy/dx) reduced by their greatest common divisor, we avoid floating-point precision issues. Time complexity is O(n^2 * log(max_coord)) and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
