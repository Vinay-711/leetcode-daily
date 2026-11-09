# move-zeroes

[Original practice problem](https://leetcode.com/problems/move-zeroes/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a two-pointer approach. The 'lastNonZeroFoundAt' pointer tracks the position where the next non-zero element should be placed. We iterate through the array, and whenever we encounter a non-zero element, we swap it with the element at 'lastNonZeroFoundAt' and increment the pointer. This ensures all non-zero elements are moved to the front while maintaining their relative order. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
