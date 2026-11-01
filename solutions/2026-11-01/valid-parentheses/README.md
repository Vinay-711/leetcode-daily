# Valid Parentheses

[Original practice problem](https://leetcode.com/problems/valid-parentheses/)

Date: 2026-11-01 (Asia/Kolkata). Status: **Accepted**.

## Approach

Track unmatched opening brackets on a stack. A closing bracket must match the most recent unmatched opening bracket; no openings may remain at the end.

## Complexity

O(n) time; O(n) space.

## Tests

Run `python3 -B test_solution.py`. Result: 7 checks passed. Original local tests do not replace hidden judge tests.

## Judge verification

**Accepted** on November 1, 2026. [Judge record](https://leetcode.com/problems/valid-parentheses/submissions/2186881700/). Verified in the logged-in platform UI. `submission.py` preserves the submitted source.
