# text-justification

[Original practice problem](https://leetcode.com/problems/text-justification/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a greedy approach to determine how many words fit into each line without exceeding `maxWidth`. For each line, if it's the last line or contains only one word, it is left-justified (words separated by single spaces and padded with spaces at the end). Otherwise, the remaining space is distributed evenly among word gaps, with left gaps receiving extra spaces if spaces cannot be divided evenly. Time complexity is O(N) where N is the total number of characters, and space complexity is O(N) for storing the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
