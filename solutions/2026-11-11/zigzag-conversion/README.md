# zigzag-conversion

[Original practice problem](https://leetcode.com/problems/zigzag-conversion/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use an array of StringBuilders to represent each row. We iterate through the string, maintaining a current row index and a direction flag. When we hit the top or bottom row, we reverse the direction. Time complexity is O(n) where n is the length of the string, and space complexity is O(n) to store the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
