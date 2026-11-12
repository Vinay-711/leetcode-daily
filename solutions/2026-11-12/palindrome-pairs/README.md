# palindrome-pairs

[Original practice problem](https://leetcode.com/problems/palindrome-pairs/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a HashMap to store the reverse of each word for O(1) lookup. For each word, we split it into two parts (prefix and suffix). If the prefix is a palindrome, we check if the reverse of the suffix exists in the map (forming a palindrome where the suffix's reverse is prepended). If the suffix is a palindrome, we check if the reverse of the prefix exists in the map (forming a palindrome where the prefix's reverse is appended). Time complexity is O(N * K^2) where N is the number of words and K is the maximum length of a word, which fits the constraints.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
