# majority-element

[Original practice problem](https://leetcode.com/problems/majority-element/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used the Boyer-Moore Voting Algorithm, which maintains a candidate and a counter. Since the majority element appears more than n/2 times, it will always remain as the candidate after iterating through the array. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
