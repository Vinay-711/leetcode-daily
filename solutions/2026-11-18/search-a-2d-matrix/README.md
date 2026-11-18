# search-a-2d-matrix

[Original practice problem](https://leetcode.com/problems/search-a-2d-matrix/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

We treat the 2‑D matrix as a sorted 1‑D array of length m*n. Using binary search we map a 1‑D index idx to matrix[idx/n][idx%n]. Each step halves the search space, giving O(log(m*n)) time and O(1) extra space.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
