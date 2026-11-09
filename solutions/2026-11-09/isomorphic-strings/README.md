# isomorphic-strings

[Original practice problem](https://leetcode.com/problems/isomorphic-strings/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use two integer arrays of size 256 to store the last seen index of each character for both strings. As we iterate through the strings, we compare the last seen positions of the current characters. If they differ, the mapping is inconsistent, and we return false. Time complexity is O(n) and space complexity is O(1) since the alphabet size is fixed at 256.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
