# 3sum

[Original practice problem](https://leetcode.com/problems/3sum/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach involves sorting the array first, which takes O(n log n). Then, we iterate through the array with a pointer 'i' and use two pointers ('left' and 'right') to find pairs that sum to -nums[i]. We skip duplicate values to ensure the result set contains only unique triplets. The overall time complexity is O(n^2) and space complexity is O(1) (excluding the output list).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
