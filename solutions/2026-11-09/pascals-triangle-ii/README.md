# pascals-triangle-ii

[Original practice problem](https://leetcode.com/problems/pascals-triangle-ii/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To compute the nth row of Pascal's triangle with O(n) space, we use the property that each element C(n, k) can be derived from C(n, k-1) using the formula C(n, k) = C(n, k-1) * (n - k + 1) / k. We initialize the row with 1 and iteratively update it in-place from right to left to avoid overwriting values needed for subsequent calculations. Time complexity is O(rowIndex^2) due to the loop, and space complexity is O(rowIndex).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
