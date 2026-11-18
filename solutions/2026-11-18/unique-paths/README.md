# unique-paths

[Original practice problem](https://leetcode.com/problems/unique-paths/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

We can solve the Unique Paths problem using Combinatorics. To reach the bottom-right corner from the top-left corner in an m x n grid, the robot must make a total of (m - 1) down moves and (n - 1) right moves. The total number of steps is (m + n - 2). Thus, the problem reduces to choosing (m - 1) down moves out of (m + n - 2) total moves, which is calculated using the binomial coefficient C(m + n - 2, m - 1). Time complexity is O(min(m, n)) and space complexity is O(1).

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
