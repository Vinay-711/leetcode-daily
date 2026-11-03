# Perfect Number

Problem: [perfect-number](https://leetcode.com/problems/perfect-number/)

Status: **Accepted** — judge verified on 2026-11-03 (Asia/Kolkata).

Submission: [official judge record](https://leetcode.com/problems/perfect-number/submissions/2188795949/).

Part of the separately requested extra practice set on 2026-11-03, beyond the daily three. AI-assisted archived practice.

## Approach

Proper divisors occur in factor pairs. Begin with one, enumerate divisors only to the square root, add both factors unless they are equal, and compare the sum with the input. Handle one separately.

Complexity: O(sqrt(n)) time and O(1) space.

## Verification

Run `python3 solutions/2026-11-03/perfect-number/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
