# freedom-trail

[Original practice problem](https://leetcode.com/problems/freedom-trail/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using dynamic programming with memoization. We define dp(keyIdx, ringIdx) as the minimum steps to spell the remaining key starting from keyIdx, given that the ring is currently positioned at ringIdx. For each character in the key, we find all occurrences in the ring and calculate the rotation distance (clockwise vs anticlockwise) to reach those positions. The time complexity is O(K * R^2) where K is the length of the key and R is the length of the ring, and space complexity is O(K * R).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
