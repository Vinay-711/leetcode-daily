# Search Insert Position

Problem: https://leetcode.com/problems/search-insert-position/

AI-assisted archived practice in Java.

## Approach

Maintain a half-open interval containing the first index whose value is at least the target. Discard its lower or upper half at each step. The resulting lower bound is both the match position and the correct insertion index.

Complexity: O(log n) time, O(1) auxiliary space.

## Verification

60,009 comparisons to an independent linear scan across sorted arrays, singleton arrays, negative values and targets outside the range. An initial UI insertion retained a duplicate template and produced Compile Error; it was replaced before the accepted retry.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted**. [Submission 2187908104](https://leetcode.com/problems/search-insert-position/submissions/2187908104/), confirmed in the official judge UI on November 2, 2026.
