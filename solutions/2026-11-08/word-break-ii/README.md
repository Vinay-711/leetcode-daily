# word-break-ii

[Original practice problem](https://leetcode.com/problems/word-break-ii/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a recursive approach with memoization to solve this problem. The memoization map stores the list of possible sentences for each suffix of the string s. This avoids redundant calculations. The time complexity is O(2^N) in the worst case where N is the length of the string, but given the constraints (N <= 20), this is efficient enough. Space complexity is O(N * M) where M is the number of possible sentences.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
