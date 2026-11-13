# concatenated-words

[Original practice problem](https://leetcode.com/problems/concatenated-words/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We sort the words by length in ascending order. This ensures that when we evaluate a word, all potential component words are shorter and have already been processed. We maintain a HashSet `dict` of previously seen words. For each word, we use Dynamic Programming (DP) to check if it can be segmented into words present in `dict`. If `dp[word.length()]` is true, the word is a concatenated word and is added to the result list. Afterward, the word itself is added to `dict`. Time Complexity: O(N * L^2 + N log N * L) where N is the number of words and L is the maximum length of a word (L <= 30). Space Complexity: O(N * L) to store words in the HashSet.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
