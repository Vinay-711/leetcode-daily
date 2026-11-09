# missing-number

[Original practice problem](https://leetcode.com/problems/missing-number/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using the mathematical formula for the sum of the first n natural numbers: sum = n * (n + 1) / 2. By calculating the expected sum of numbers from 0 to n and subtracting the actual sum of the elements in the array, the difference is the missing number. This approach runs in O(n) time and uses O(1) extra space.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
