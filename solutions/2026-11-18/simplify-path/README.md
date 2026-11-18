# simplify-path

[Original practice problem](https://leetcode.com/problems/simplify-path/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

Split the input by '/' and process each token with a stack (ArrayDeque). Ignore empty strings and ".". When encountering ".." pop the stack if not empty. Otherwise push the token as a valid directory name (including strings of periods). After processing, rebuild the canonical path by joining stack elements with '/' and prepend a leading '/'. If the stack is empty, return "/". Time complexity O(N) where N is the length of the path; space complexity O(N) for the stack.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
