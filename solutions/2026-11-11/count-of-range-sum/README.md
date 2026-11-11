# count-of-range-sum

[Original practice problem](https://leetcode.com/problems/count-of-range-sum/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks us to count the number of range sums S(i, j) that fall within a given range [lower, upper]. A range sum S(i, j) is the sum of elements from index i to j inclusive. We can transform this problem using prefix sums. Let P[k] be the sum of the first k elements of `nums` (i.e., `nums[0] + ... + nums[k-1]`), with P[0] = 0. Then, S(i, j) can be expressed as P[j+1] - P[i]. We need to find pairs (i, j) such that `0 <= i <= j < nums.length` and `lower <= P[j+1] - P[i] <= upper`. Let `k_prime = j+1`. The condition becomes `lower <= P[k_prime] - P[i] <= upper` where `0 <= i < k_prime <= nums.length`. The `prefixSums` array will have `nums.length + 1` elements, from `P[0]` to `P[nums.length]`. Since `nums[i]` can be large and `nums.length` up to 10^5, prefix sums can exceed `Integer.MAX_VALUE`, so we must use `long` for prefix sums.

This problem can be efficiently solved using a divide and conquer approach, similar to merge sort. The `mergeSortAndCount` function recursively divides the `prefixSums` array into two halves. It counts range sums entirely within the left half, entirely within the right half (via recursive calls), and then counts range sums that span across the two halves. The crucial part is counting the cross-half sums. For each element `P[k_prime]` in the right half, we need to find how many `P[i]` in the left half satisfy `P[k_prime] - upper <= P[i] <= P[k_prime] - lower`. Since both halves are sorted (due to the merge sort process), we can use two pointers (`j` and `l`) to efficiently count these `P[i]` values in `O(N)` time for each merge step. The `j` pointer finds the first `P[i]` that is `>= P[k_prime] - upper`, and the `l` pointer finds the first `P[i]` that is `> P[k_prime] - lower`. The count for `P[k_prime]` is `l - j`. After counting, the two halves are merged to maintain the sorted order for the next level of recursion.

Time Complexity: The recurrence relation is `T(N) = 2T(N/2) + O(N)`, which solves to `O(N log N)`, where N is the length of the `prefixSums` array (`nums.length + 1`).
Space Complexity: `O(N)` for the `prefixSums` array and the temporary array used during the merge step.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
