# Regular Expression Matching

Problem: [regular-expression-matching](https://leetcode.com/problems/regular-expression-matching/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/regular-expression-matching/submissions/2188806329/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Prefix dynamic programming distinguishes zero copies of a starred token from consuming another matching character. A plain token advances both prefixes. The final cell requires the entire input to match.

Complexity: O(|s| |p|) time and space.

## Verification

Run `python3 solutions/2026-11-03/regular-expression-matching/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
