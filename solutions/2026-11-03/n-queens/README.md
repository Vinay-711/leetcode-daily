# N Queens

Problem: [n-queens](https://leetcode.com/problems/n-queens/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/n-queens/submissions/2188804576/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Place one queen per row. Track occupied columns and the two diagonals, undoing each choice after recursion. A completed placement produces a fresh immutable string per row. Every placement is generated once.

Complexity: O(n! * n^2) worst-case time including board output and O(n) working space excluding output.

## Verification

Run `python3 solutions/2026-11-03/n-queens/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
