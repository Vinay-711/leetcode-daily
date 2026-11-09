# word-pattern

[Original practice problem](https://leetcode.com/problems/word-pattern/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used two HashMaps to maintain a bidirectional mapping between characters in the pattern and words in the string. Alternatively, I could use a single map and a set to track used words. The time complexity is O(N + M) where N is the length of the pattern and M is the length of the string, as we split the string and iterate once. Space complexity is O(K) where K is the number of unique words/characters.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
