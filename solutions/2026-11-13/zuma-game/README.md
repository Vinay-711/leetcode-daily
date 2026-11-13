# zuma-game

[Original practice problem](https://leetcode.com/problems/zuma-game/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We can solve this problem using Breadth-First Search (BFS) to find the minimum number of inserted balls needed to clear the board. Each state in the BFS is represented by `(board, hand, step)`. To prune the search space effectively:
1. We sort the characters in `hand` so that states with equivalent remaining balls can be deduplicated.
2. We only insert a ball of color `c` adjacent to an existing ball of the same color `c` on the board (i.e., position `i` is valid if `board[i] == c` or `board[i-1] == c`). Inserting a color not adjacent to its matching color on the board requires inserting 3 balls to collapse back to the original state without clearing any existing balls, which is never optimal.
3. After each insertion, we reduce consecutive groups of 3 or more matching balls recursively until no such group exists.

Since the maximum depth of BFS is at most the hand length (<= 5), the search tree is very shallow and terminates rapidly.

Time Complexity: O(V * L * H) where V is the number of distinct (board, hand) states visited (at most a few thousands), L <= 21 is board length, and H <= 5 is hand size.
Space Complexity: O(V) for the visited set and BFS queue.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
