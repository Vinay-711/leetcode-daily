# Hamming Distance

Problem: [hamming-distance](https://leetcode.com/problems/hamming-distance/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://leetcode.com/problems/hamming-distance/submissions/2188521547/).

## Approach

XOR marks exactly the differing bit positions. Repeatedly clear the lowest set bit with bits & (bits-1); the number of iterations equals the Hamming distance.

Complexity: O(k) time for k differing bits, at most 31, and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/hamming-distance/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
