# word-ladder

[Original practice problem](https://leetcode.com/problems/word-ladder/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use Bidirectional Breadth-First Search (BFS) to find the shortest transformation sequence. Bidirectional BFS searches simultaneously from both `beginWord` and `endWord`, significantly reducing the search space compared to standard BFS. At each step, we expand the smaller set of frontier words to minimize branching. We mutate each character of the current word from 'a' to 'z' and check if the transformed word exists in the target set (indicating a valid sequence found) or in the unvisited word set (adding it to the next frontier). Time Complexity: O(N * L * 26) where N is the number of words in `wordList` and L is the word length. Space Complexity: O(N * L) to store words in hash sets.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
