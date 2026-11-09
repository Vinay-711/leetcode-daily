# basic-calculator

[Original practice problem](https://leetcode.com/problems/basic-calculator/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using a stack-based approach to handle nested parentheses. We maintain a current result and a sign (+1 or -1). When encountering '(', we push the current result and the sign onto the stack to evaluate the sub-expression. When encountering ')', we pop the previous result and sign to combine with the evaluated sub-expression. Time complexity is O(n) as we traverse the string once, and space complexity is O(n) for the stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
