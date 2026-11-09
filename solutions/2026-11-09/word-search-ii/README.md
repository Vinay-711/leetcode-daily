# word-search-ii

[Original practice problem](https://leetcode.com/problems/word-search-ii/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a Trie to store the words for efficient prefix searching. During DFS on the board, I prune the search if the current path does not exist in the Trie. To avoid duplicates and handle the 'used once' constraint, I temporarily mark visited cells with a special character. Time complexity is O(M * N * 4^L) where M, N are board dimensions and L is max word length, though Trie pruning significantly optimizes this. Space complexity is O(W * L) for the Trie.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
