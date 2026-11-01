# Contains Duplicate

Problem: [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Accepted — 80/80 testcases**

## Approach

Maintain a set of previously seen values. Before adding a value, check whether it is already present. Such a match proves a duplicate; reaching the end proves all values are distinct.

## Complexity

Expected O(n) time and O(n) auxiliary space.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 205 cases passed, including randomized and maximum-length input. Tests are original and do not represent the hidden judge suite.

## Judge result

Status: **Accepted — 80/80 testcases**. Submission/log ID: `2186875590`.

[Judge record](https://leetcode.com/problems/contains-duplicate/submissions/2186875590/). Verified in the logged-in platform UI on November 1, 2026. `submission.py` preserves the submitted code; `solution.py` is the independently tested reusable version.

AI-assisted archived practice; no rated contest participation is claimed.
