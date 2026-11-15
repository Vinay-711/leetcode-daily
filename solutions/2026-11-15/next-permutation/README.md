# next-permutation

[Original practice problem](https://leetcode.com/problems/next-permutation/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To find the next permutation, we first traverse backwards from the end of the array to find the first element nums[i] that is smaller than its successor (nums[i] < nums[i + 1]). If no such index exists, the array is in descending order, so we reverse it to get the lowest permutation. If we find such an index i, we search from the end again to find the first element nums[j] greater than nums[i]. We swap nums[i] and nums[j], and finally reverse the sub-array from i + 1 to the end to get the lexicographically next permutation. Time Complexity is O(N) and Space Complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
