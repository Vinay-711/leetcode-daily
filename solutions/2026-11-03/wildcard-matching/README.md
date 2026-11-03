# Wildcard Matching

Problem: [wildcard-matching](https://leetcode.com/problems/wildcard-matching/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/wildcard-matching/submissions/2188807683/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Store a single DP row. A star matches an empty sequence using the current left cell or one more character using the old cell. A literal or question mark uses the previous diagonal. Initialize the empty string using only leading stars.

Complexity: O(|s| |p|) time and O(|p|) space.

## Verification

Run `python3 solutions/2026-11-03/wildcard-matching/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
