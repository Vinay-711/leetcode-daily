# create-maximum-number

[Original practice problem](https://leetcode.com/problems/create-maximum-number/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks us to construct the largest possible number of length `k` by picking digits from two arrays, `nums1` and `nums2`, while preserving the relative order of digits from the same original array. This problem can be broken down into three main subproblems:

1.  **`maxArray(int[] nums, int length)`**: Given an array `nums` and a desired `length`, find the largest possible number of that `length` by picking digits from `nums` while preserving their relative order. This is solved using a monotonic stack approach. We iterate through `nums`, maintaining a `result` array (acting as a stack). If the current digit is greater than the last digit in `result` and we still have digits to 'drop' (i.e., `nums.length - length` elements to discard), we pop from `result` to make space for the larger current digit. Then, if `result` is not yet full, we add the current digit. This ensures the resulting `length`-digit number is maximized lexicographically. This function has a time complexity of O(N) where N is the length of `nums`.

2.  **`merge(int[] nums1, int[] nums2)`**: Given two arrays of digits, merge them to form the largest possible number. This is a greedy merge process. At each step, we compare the current leading digits of `nums1` and `nums2`. If they are different, we pick the larger one. If they are the same, we need to look ahead and compare the *remaining suffixes* of `nums1` and `nums2` to decide which digit to pick. This comparison is handled by the `isGreater` helper function. This function has a time complexity of O(L1 + L2) where L1 and L2 are the lengths of the input arrays.

3.  **Main Logic (`maxNumber`)**: The core idea is to iterate through all possible ways to split the `k` digits between `nums1` and `nums2`. Let `i` be the number of digits taken from `nums1`, then `k - i` digits must be taken from `nums2`. The valid range for `i` is `[max(0, k - n), min(k, m)]`, where `m` and `n` are the lengths of `nums1` and `nums2` respectively. For each valid `i`:
    a.  Call `maxArray(nums1, i)` to get the best `i` digits from `nums1`.
    b.  Call `maxArray(nums2, k - i)` to get the best `k - i` digits from `nums2`.
    c.  Merge these two resulting arrays using `merge`.
    d.  Compare this merged array with the current overall maximum result found so far using `isGreater` and update if the new one is larger.

**`isGreater(int[] nums1, int i, int[] nums2, int j)`**: This helper function compares the suffix of `nums1` starting at index `i` with the suffix of `nums2` starting at index `j` lexicographically. It returns `true` if `nums1[i...]` is greater than `nums2[j...]`, and `false` otherwise. This function has a time complexity of O(min(length of suffix1, length of suffix2)).

**Time Complexity**: The main loop runs `O(k)` times. Inside the loop, `maxArray` takes `O(m)` and `O(n)` respectively. The `merge` function takes `O(k)` time (because the total number of comparisons across all `isGreater` calls within one `merge` is `O(k)`). The final `isGreater` comparison takes `O(k)`. Therefore, the total time complexity is `O(k * (m + n + k))`, which simplifies to `O(k * (m + n))` since `k <= m + n`. Given `m, n <= 500` and `k <= m + n <= 1000`, this is roughly `1000 * (500 + 500) = 10^6` operations, which is efficient enough.

**Space Complexity**: `O(m + n)` for storing intermediate arrays (`sub1`, `sub2`, `merged`, `maxResult`).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
