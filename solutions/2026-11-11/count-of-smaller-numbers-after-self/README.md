# count-of-smaller-numbers-after-self

[Original practice problem](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks us to count, for each element `nums[i]`, how many elements to its right are strictly smaller. A brute-force O(N^2) approach would be too slow for N=10^5. This problem can be efficiently solved using a modified merge sort algorithm in O(N log N) time complexity.The core idea is to augment the merge sort process. When merging two sorted subarrays (left_half and right_half), we maintain the original indices of the elements. As we merge, if an element `temp[p1]` from the left half is being placed into the sorted array, we know that all elements already taken from the right half (`temp[p2]` onwards) are smaller than `temp[p1]` and were originally to its right. We keep a `rightCount` variable that increments every time an element is taken from the right half. When an element from the left half is chosen, its `counts` entry is updated by adding `rightCount`. If an element from the right half is chosen, `rightCount` is incremented.This approach requires storing pairs of `(value, original_index)` to preserve the original positions of elements throughout the sorting process. A temporary array `temp` is used during the merge step to avoid repeated memory allocation.Time Complexity: O(N log N) due to the merge sort algorithm.Space Complexity: O(N) for storing the `Pair` objects, the `counts` array, and the `temp` array.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
