# search-in-rotated-sorted-array

[Original practice problem](https://leetcode.com/problems/search-in-rotated-sorted-array/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using a modified binary search. In a rotated sorted array, at least one half (left or right) of any midpoint split will always be sorted. We check which half is sorted and determine if the target lies within that range. If it does, we narrow our search to that half; otherwise, we search the other half. Time complexity is O(log n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
