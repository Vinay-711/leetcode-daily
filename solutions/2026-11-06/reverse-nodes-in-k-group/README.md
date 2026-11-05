# reverse-nodes-in-k-group

[Original practice problem](https://leetcode.com/problems/reverse-nodes-in-k-group/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (62/62 testcases passed). Platform: **LeetCode**. Difficulty: **Hard**.

## Approach

Recursive k-group reversal of singly-linked list. Checks if k nodes exist before reversing. Reverses k nodes in O(k) time and stitches recursive subproblem to head.next. Total Time: O(N), Space: O(N/k) recursion stack.

## Verification

Verified Accepted on LeetCode live judge (62/62 testcases passed).
