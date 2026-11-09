# pascals-triangle

[Original practice problem](https://leetcode.com/problems/pascals-triangle/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a nested loop approach to build Pascal's triangle row by row. Each row starts and ends with 1, and intermediate values are calculated as the sum of the two elements directly above in the previous row. Time complexity is O(numRows^2) and space complexity is O(numRows^2) to store the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
