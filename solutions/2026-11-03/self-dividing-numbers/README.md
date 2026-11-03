# Self Dividing Numbers

Problem: [self-dividing-numbers](https://leetcode.com/problems/self-dividing-numbers/)

Status: **Accepted** — judge verified on 2026-11-03 (Asia/Kolkata).

Submission: [official judge record](https://leetcode.com/problems/self-dividing-numbers/submissions/2188800856/).

Part of the separately requested extra practice set on 2026-11-03, beyond the daily three. AI-assisted archived practice.

## Approach

Check every digit of each candidate; reject zero digits and divisors that leave a remainder.

Complexity: O((right-left+1) log right) time and O(k) output space.

## Verification

Run `python3 solutions/2026-11-03/self-dividing-numbers/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
