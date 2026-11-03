# Median Of Two Sorted Arrays

Problem: [median-of-two-sorted-arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/2188809332/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Binary search a partition of the shorter array while deriving the partition of the other so the left side contains half the values. Once both left maxima fit below the opposite right minima, compute the median from the boundary values.

Complexity: O(log(min(m,n)+1)) time and O(1) space.

## Verification

Run `python3 solutions/2026-11-03/median-of-two-sorted-arrays/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
