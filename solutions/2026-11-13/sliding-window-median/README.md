# sliding-window-median

[Original practice problem](https://leetcode.com/problems/sliding-window-median/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

Used two TreeSets to maintain the sliding window elements, split into a 'left' (max) and 'right' (min) set. Since TreeSets don't support duplicate values, we store indices and use a custom comparator to handle duplicate values in the input array. Time complexity is O(N log K) and space complexity is O(N).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
