# number-of-digit-one

[Original practice problem](https://leetcode.com/problems/number-of-digit-one/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `leetcode_number-of-digit-one_1794502263`

## Approach

We can count the occurrences of the digit 1 for each digit position (ones, tens, hundreds, etc.) separately. For a given position with a factor (1, 10, 100, etc.), we split the number into three parts: higher digits, current digit, and lower digits. We calculate how many times 1 appears at this position based on these parts. Time complexity is O(log10(n)) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
