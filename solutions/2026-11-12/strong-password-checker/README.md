# strong-password-checker

[Original practice problem](https://leetcode.com/problems/strong-password-checker/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved by handling three cases based on length: <6, 6-20, and >20. For length <6, we need insertions to meet length and character type requirements. For length >20, we need deletions to meet length and repeating character requirements. For length 6-20, we only need replacements to fix repeating characters. We track repeating sequences using modulo 3 logic to prioritize deletions that reduce the number of replacements needed. Time complexity is O(N) where N is the length of the password, and space complexity is O(N) to store the repeating sequence counts.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
