# largest-rectangle-in-histogram

[Original practice problem](https://leetcode.com/problems/largest-rectangle-in-histogram/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (62/62 testcases passed). Platform: **LeetCode**. Difficulty: **Hard**.

## Approach

Monotonic increasing stack algorithm for largest rectangle in histogram. Each bar is pushed and popped at most once. Width is computed from the top of the stack after popping the current height. Time Complexity: O(N), Space Complexity: O(N).

## Verification

Verified Accepted on LeetCode live judge (62/62 testcases passed).
