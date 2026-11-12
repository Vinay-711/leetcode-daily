# max-sum-of-rectangle-no-larger-than-k

[Original practice problem](https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach uses a 2D prefix sum optimization combined with a 1D subarray sum problem. We iterate over all pairs of columns (left, right), calculate the row-wise sums between these columns, and then find the maximum subarray sum in the resulting 1D array that is <= k using a TreeSet to perform binary search in O(N log N). Total time complexity is O(cols^2 * rows * log(rows)), space complexity is O(rows).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
