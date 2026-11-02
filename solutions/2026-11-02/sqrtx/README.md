# Sqrt(x)

Problem: https://leetcode.com/problems/sqrtx/

AI-assisted archived practice in Java.

## Approach

Binary-search the first nonnegative integer whose square exceeds x; the preceding integer is the floor square root. The upper sentinel 46341 is above every possible valid answer for a signed 32-bit input. Widen multiplication to long to avoid overflow.

Complexity: O(log x) time, O(1) space.

## Verification

139,022 checks around every representable perfect square, plus Integer.MAX_VALUE. Validate r*r <= x < (r+1)*(r+1) using long arithmetic.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted**. [Submission 2187910097](https://leetcode.com/problems/sqrtx/submissions/2187910097/), confirmed in the official judge UI on November 2, 2026.
