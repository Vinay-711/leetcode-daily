# word-search-ii

[Original practice problem](https://leetcode.com/problems/word-search-ii/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `leetcode_word-search-ii_1794502226`

## Approach

We use a Trie (Prefix Tree) combined with Backtracking (DFS). First, we insert all given words into a Trie, storing the full word string at the terminal leaf node of each word. Then, we iterate over each cell in the board and perform DFS traversal, moving in 4 directions. DFS explores the board while navigating down the Trie. If a valid word is found in the Trie during DFS, it is added to the result list and cleared from the Trie node to prevent duplicate matches. Cells visited in the current DFS path are temporarily marked with '#' to prevent reusing them within the same word. Time complexity: O(M * N * 3^(L-1) + W * L) where M, N are board dimensions, W is the number of words, and L is the maximum length of a word. Space complexity: O(W * L) to build the Trie.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
