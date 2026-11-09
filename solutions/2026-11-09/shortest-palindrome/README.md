# shortest-palindrome

[Original practice problem](https://leetcode.com/problems/shortest-palindrome/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To find the shortest palindrome, we need to find the longest palindromic prefix of the string s. By reversing s and concatenating it with s using a separator, we can use the KMP algorithm's failure function (LPS array) to find the length of the longest prefix of s that is also a suffix of the reversed string. Time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
