# Longest Valid Parentheses

Problem: [longest-valid-parentheses](https://leetcode.com/problems/longest-valid-parentheses/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/longest-valid-parentheses/submissions/2188815530/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Keep indices of unmatched opening parentheses above a boundary sentinel. A matched closing parenthesis yields a valid suffix ending here; an unmatched closing parenthesis resets the boundary. Track the maximum suffix length.

Complexity: O(n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/longest-valid-parentheses/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
