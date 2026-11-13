# reverse-pairs

[Original practice problem](https://leetcode.com/problems/reverse-pairs/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks us to count pairs (i, j) such that i < j and nums[i] > 2 * nums[j]. This is a variation of the classic counting inversions problem, which can be efficiently solved using a modified merge sort algorithm. The core idea is to divide the array into two halves, recursively count reverse pairs within each half, and then count reverse pairs where one element is in the left half and the other is in the right half during the merge step. When merging two sorted halves, say `left_half` (from `low` to `mid`) and `right_half` (from `mid+1` to `high`), we iterate through the `left_half` with a pointer `i`. For each `nums[i]`, we use a second pointer `j` to find how many elements `nums[j]` in the `right_half` satisfy `nums[i] > 2 * nums[j]`. Since both halves are sorted, `j` only needs to advance forward. The number of such `nums[j]` elements is added to the total count. After counting, the two halves are merged to maintain the sorted order for subsequent recursive calls. It's crucial to cast `nums[i]` and `nums[j]` to `long` before performing the multiplication `2 * nums[j]` to prevent integer overflow, as `nums[j]` can be up to `2^31 - 1` or down to `-2^31`. The time complexity is O(N log N) due to the merge sort structure, and the space complexity is O(N) for the temporary array used during merging.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
