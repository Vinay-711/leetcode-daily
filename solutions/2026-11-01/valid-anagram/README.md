# Valid Anagram

[Original practice problem](https://leetcode.com/problems/valid-anagram/)

Date: 2026-11-01 (Asia/Kolkata). Status: **Accepted**.

## Approach

Compare character multiplicities, including repeated letters. Equal counts are necessary and sufficient for an anagram.

## Complexity

O(n+m) time; O(u) space for u distinct characters.

## Tests

Run `python3 -B test_solution.py`. Result: 4 checks passed. Original local tests do not replace hidden judge tests.

## Judge verification

**Accepted** on November 1, 2026. [Judge record](https://leetcode.com/problems/valid-anagram/submissions/2186880996/). Verified in the logged-in platform UI. `submission.py` preserves the submitted source.
