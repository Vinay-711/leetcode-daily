# restore-ip-addresses

[Original practice problem](https://leetcode.com/problems/restore-ip-addresses/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

Backtracking tries at most 3 choices for each of the 4 octets (3^4≈81 states). Time O(1) for given limits, space O(1) extra (recursion depth ≤4) plus output storage.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
