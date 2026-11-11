# patching-array

[Original practice problem](https://leetcode.com/problems/patching-array/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We maintain a variable 'miss' representing the smallest sum we cannot yet form. Initially, miss = 1. We iterate through the array; if the current number is less than or equal to 'miss', we can extend our range to 'miss + nums[i]'. If the current number is greater than 'miss' or we run out of numbers, we must add 'miss' as a patch to double our reachable range to '2 * miss'. Time complexity is O(m + log n) where m is the length of nums, and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
