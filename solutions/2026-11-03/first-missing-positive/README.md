# First Missing Positive

Problem: [first-missing-positive](https://leetcode.com/problems/first-missing-positive/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/first-missing-positive/submissions/2188812097/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Move each in-range positive value x to index x-1. Duplicate values stop the swap loop. Every successful swap fixes a position, giving linear total work. The first position with the wrong value identifies the missing positive. The input array is intentionally modified.

Complexity: O(n) time and O(1) auxiliary space.

## Verification

Run `python3 solutions/2026-11-03/first-missing-positive/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
