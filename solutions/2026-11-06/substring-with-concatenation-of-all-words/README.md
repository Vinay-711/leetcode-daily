# substring-with-concatenation-of-all-words

[Original practice problem](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach uses a sliding window technique for each possible offset (0 to wordLength-1). For each offset, we maintain a frequency map of words in the current window of size (words.length * wordLength). We compare this with the target frequency map of the input words. Time complexity is O(wordLength * s.length) and space complexity is O(words.length * wordLength).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
