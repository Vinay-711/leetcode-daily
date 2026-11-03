# Power Of Four

Problem: [power-of-four](https://leetcode.com/problems/power-of-four/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://leetcode.com/problems/power-of-four/submissions/2188519814/).

## Approach

A positive power of two has exactly one set bit. Powers of four use the even-indexed bit positions, which the alternating 0x55555555 mask selects. Both conditions are necessary.

Complexity: O(1) time and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/power-of-four/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
