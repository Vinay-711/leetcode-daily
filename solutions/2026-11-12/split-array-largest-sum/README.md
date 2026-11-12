# split-array-largest-sum

[Original practice problem](https://leetcode.com/problems/split-array-largest-sum/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using binary search on the answer. The range of possible sums is [max(nums), sum(nums)]. For a given mid value, we check if it's possible to split the array into at most k subarrays such that each subarray sum is <= mid. If possible, we try a smaller sum; otherwise, we increase it. Time complexity is O(N * log(sum(nums))), space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
