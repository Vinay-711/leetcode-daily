# longest-substring-without-repeating-characters

[Original practice problem](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a sliding window approach with an integer array of size 128 to store the last seen index of each character. The window expands by moving the right pointer, and if a duplicate is found, the left pointer jumps to the position after the last occurrence of that character. Time complexity is O(n) and space complexity is O(1) as the character set size is constant.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
