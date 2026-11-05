# letter-combinations-of-a-phone-number

[Original practice problem](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a backtracking approach to generate all combinations. The mapping of digits to letters is stored in a String array. The time complexity is O(3^N * 4^M) where N is the number of digits mapping to 3 letters and M is the number of digits mapping to 4 letters. Space complexity is O(N+M) for the recursion stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
