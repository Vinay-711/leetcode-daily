# remove-invalid-parentheses

[Original practice problem](https://leetcode.com/problems/remove-invalid-parentheses/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks us to find all valid strings by removing the minimum number of invalid parentheses. This is a classic shortest path problem on a graph where nodes are strings and edges represent removing one parenthesis. Breadth-First Search (BFS) is suitable for finding solutions with the minimum number of operations.

1.  **BFS Initialization**: We start with the original string `s` in a queue and a `visited` set to keep track of strings already processed, preventing redundant computations and cycles.
2.  **Level-by-Level Exploration**: The BFS proceeds level by level. Each level represents strings formed by removing one more parenthesis than the previous level. The first level at which we find any valid string guarantees that these strings have the minimum number of removals.
3.  **Validity Check**: A helper function `isValid(String str)` checks if a string is a valid parenthesis expression. It iterates through the string, maintaining a `balance` counter. `balance` increments for '(' and decrements for ')'. If `balance` ever drops below zero, or if the final `balance` is not zero, the string is invalid. Letters are ignored in this check.
4.  **Generating Next States**: For each string `currentString` dequeued from the queue:
    *   If `isValid(currentString)` is true, we add it to our `result` list and set a `found` flag to true. This `found` flag indicates that we have reached the minimum removal level.
    *   If `found` is true, we stop generating children for `currentString` and any subsequent strings in the *current BFS level*. We only collect other valid strings at this same level.
    *   If `found` is false (meaning we haven't found any valid strings yet at this level), we generate all possible strings by removing one parenthesis ('(' or ')') from `currentString`. Each newly generated string `nextString` is added to the queue and `visited` set if it hasn't been visited before.
5.  **Termination**: Once a valid string is found (`found` becomes true), the BFS continues to process the *rest of the current level* to find all other valid strings with the same minimum number of removals. After the current level is fully processed, if `found` is true, the BFS terminates, and the `result` list is returned.

**Time Complexity**: Let `N` be the length of the string and `P` be the number of parentheses. In the worst case, we might explore `sum_{k=0 to min_removals} (P choose k)` unique strings. For each string, `isValid` takes `O(N)` time. Generating children involves iterating `N` times and `substring` operations, taking `O(N)` for each child. There are `P` possible children (removing one parenthesis). So, generating children takes `O(P*N)`. String hashing and equality in the `visited` set also take `O(N)`. Thus, the total time complexity is roughly `sum_{k=0 to min_removals} (P choose k) * (N + P*N)`. Given `N <= 25` and `P <= 20`, and `min_removals` typically being small, this approach is efficient enough (e.g., for `min_removals=4`, it's about `6000 * 500 = 3 * 10^6` operations).

**Space Complexity**: The `visited` set and `queue` store strings. In the worst case, they could store `sum_{k=0 to min_removals} (P choose k)` strings, each of length up to `N`. So, the space complexity is `sum_{k=0 to min_removals} (P choose k) * N`.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
