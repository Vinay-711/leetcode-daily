# minimum-window-substring

[Original practice problem](https://leetcode.com/problems/minimum-window-substring/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (62/62 testcases passed). Platform: **LeetCode**. Difficulty: **Hard**.

## Approach

Two-pointer sliding window with ASCII frequency table. Expands right pointer until all characters of t are matched, then contracts left pointer to find minimum window length. Time Complexity: O(M + N), Space: O(1) fixed 128-element frequency array.

## Verification

Verified Accepted on LeetCode live judge (62/62 testcases passed).
