# Power Of Three

Problem: [power-of-three](https://leetcode.com/problems/power-of-three/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://leetcode.com/problems/power-of-three/submissions/2188518584/).

## Approach

The largest power of three fitting a signed 32-bit integer is 3^19 = 1162261467. Every positive divisor of this number is a power of three, because three is prime. Check positivity before taking the remainder.

Complexity: O(1) time and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/power-of-three/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
