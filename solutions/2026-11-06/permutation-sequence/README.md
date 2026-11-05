# permutation-sequence

[Original practice problem](https://leetcode.com/problems/permutation-sequence/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (62/62 testcases passed). Platform: **LeetCode**. Difficulty: **Hard**.

## Approach

Factorial number system / Lehmer code. Decrements k to 0-based indexing, computes digit index via k / (n-1)!, and extracts from available digits list. Time Complexity: O(N^2) where N <= 9, Space: O(N).

## Verification

Verified Accepted on LeetCode live judge (62/62 testcases passed).
