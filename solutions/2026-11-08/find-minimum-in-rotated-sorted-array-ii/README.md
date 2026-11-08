# find-minimum-in-rotated-sorted-array-ii

[Original practice problem](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a modified binary search. When nums[mid] > nums[right], the minimum must be in the right half. When nums[mid] < nums[right], the minimum is in the left half (including mid). When nums[mid] == nums[right], we cannot determine the side, so we decrement the right pointer to shrink the search space. Time complexity is O(n) in the worst case (all elements equal) and O(log n) on average. Space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
