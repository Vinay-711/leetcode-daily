# Ugly Number

Problem: [ugly-number](https://leetcode.com/problems/ugly-number/)

Status: **Accepted** — judge verified on 2026-11-03 (Asia/Kolkata).

Submission: [official judge record](https://leetcode.com/problems/ugly-number/submissions/2188802492/).

Part of the separately requested extra practice set on 2026-11-03, beyond the daily three. AI-assisted archived practice.

## Approach

Remove every factor of 2, 3 and 5. A positive number qualifies exactly when its remainder becomes one.

Complexity: O(log n) time and O(1) space.

## Verification

Run `python3 solutions/2026-11-03/ugly-number/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
