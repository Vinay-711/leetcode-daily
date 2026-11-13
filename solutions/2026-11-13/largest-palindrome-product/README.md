# largest-palindrome-product

[Original practice problem](https://leetcode.com/problems/largest-palindrome-product/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To find the largest palindromic product of two n-digit numbers, we iterate downwards from the largest possible n-digit number. We construct a palindrome by taking a number 'i' and appending its reverse. We then check if this palindrome is divisible by any n-digit number 'j' such that j*j >= palindrome. The time complexity is roughly O(10^n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
