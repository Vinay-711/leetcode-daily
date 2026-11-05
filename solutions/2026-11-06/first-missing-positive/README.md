# first-missing-positive

[Original practice problem](https://leetcode.com/problems/first-missing-positive/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The algorithm uses the cyclic sort pattern to place each number x in the range [1, n] at index x-1. We iterate through the array, swapping elements to their correct positions if they are within the valid range and not already in the correct spot. After sorting, we perform a second pass to find the first index i where nums[i] != i + 1. If all positions are correct, the missing number is n + 1. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
