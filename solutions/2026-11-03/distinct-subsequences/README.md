# Distinct Subsequences

Problem: [distinct-subsequences](https://leetcode.com/problems/distinct-subsequences/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/distinct-subsequences/submissions/2188805815/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Let dp[j] count ways to form the first j target characters. For each source character update target positions backwards so that character is used at most once. Saturate intermediate counts at the guaranteed answer bound to prevent overflow; all transitions add nonnegative counts, so a final answer within that bound remains exact.

Complexity: O(|s| |t|) time and O(|t|) space.

## Verification

Run `python3 solutions/2026-11-03/distinct-subsequences/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
