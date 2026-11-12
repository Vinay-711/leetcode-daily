# 4sum

[Original practice problem](https://leetcode.com/problems/4sum/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution employs a sorted array and a nested two-pointer approach to find all unique quadruplets that sum up to the target. First, the input array `nums` is sorted. This allows for efficient skipping of duplicate elements and the use of the two-pointer technique. The algorithm iterates through the array with two outer loops, fixing the first two numbers (`nums[i]` and `nums[j]`). For each pair `(nums[i], nums[j])`, two pointers (`left` and `right`) are used to find the remaining two numbers in the subarray `nums[j+1...n-1]`. The `left` pointer starts at `j+1` and moves right, while the `right` pointer starts at `n-1` and moves left. If `nums[left] + nums[right]` equals the `target - nums[i] - nums[j]`, a valid quadruplet is found, added to the result, and both pointers are moved inward while skipping any duplicate elements. If the sum is too small, `left` is incremented; if too large, `right` is decremented. Several pruning optimizations are included to `break` or `continue` early if it's impossible to form a valid sum with the current `nums[i]` or `nums[j]`. All sums are cast to `long` to prevent integer overflow, as `nums[i]` and `target` can be large. The time complexity is O(N^3) due to the nested loops and two-pointer scan, dominated by the three nested loops after sorting (O(N log N)). The space complexity is O(1) beyond the output list, or O(N) if considering the space used by `Arrays.sort` in some implementations.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
