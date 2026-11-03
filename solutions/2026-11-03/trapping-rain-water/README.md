# Trapping Rain Water

Problem: [trapping-rain-water](https://leetcode.com/problems/trapping-rain-water/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/trapping-rain-water/submissions/2188810689/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Maintain the maximum wall seen from each end. Process the side with the lower known boundary, whose trapped depth is already determined independently of the unexplored interior.

Complexity: O(n) time and O(1) space.

## Verification

Run `python3 solutions/2026-11-03/trapping-rain-water/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
