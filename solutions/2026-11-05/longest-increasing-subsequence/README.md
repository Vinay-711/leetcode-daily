# longest-increasing-subsequence

[Original practice problem](https://leetcode.com/problems/longest-increasing-subsequence/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using the patience sorting algorithm approach. We maintain a list 'tails' where tails[i] is the smallest tail of all increasing subsequences of length i+1. For each number in nums, we use binary search to find its position in 'tails' to either extend the longest subsequence or replace an existing element to maintain the smallest possible tail for that length. Time complexity is O(n log n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
