# Valid Perfect Square

Problem: https://leetcode.com/problems/valid-perfect-square/

AI-assisted archived practice in Java.

## Approach

Binary-search candidates from 1 through 46340. Squaring is strictly increasing over positive integers, so compare a long product with num and discard the impossible half. Return true only for exact equality.

Complexity: O(log num) time, O(1) space.

## Verification

139,019 square and adjacent nonsquare checks, plus Integer.MAX_VALUE. No floating-point or square-root library is used.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted**. [Submission 2187911407](https://leetcode.com/problems/valid-perfect-square/submissions/2187911407/), confirmed in the official judge UI on November 2, 2026.
