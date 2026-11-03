# N Queens Ii

Problem: [n-queens-ii](https://leetcode.com/problems/n-queens-ii/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/n-queens-ii/submissions/2188805423/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Use bit masks to represent blocked columns in the next row. Extract each free column with the lowest set bit and shift diagonal masks as recursion advances. Count leaves without allocating boards.

Complexity: O(n!) time and O(n) recursion space.

## Verification

Run `python3 solutions/2026-11-03/n-queens-ii/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
