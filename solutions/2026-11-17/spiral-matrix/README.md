# spiral-matrix

[Original practice problem](https://leetcode.com/problems/spiral-matrix/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We maintain four boundaries (top, bottom, left, right) and traverse the matrix layer by layer. After traversing each side, we shrink the corresponding boundary. The time complexity is O(m*n) as we visit each element once, and space complexity is O(1) excluding the output list.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
