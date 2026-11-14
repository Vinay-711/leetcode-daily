# tag-validator

[Original practice problem](https://leetcode.com/problems/tag-validator/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution uses a stack to track nested tags and a pointer to traverse the string. It handles three main components: start tags, end tags, and CDATA sections. A stack ensures tags are closed in the correct order. The logic checks for valid tag names (1-9 uppercase letters) and ensures the entire code is wrapped in exactly one root tag. Time complexity is O(N) where N is the length of the code, and space complexity is O(N) for the stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
