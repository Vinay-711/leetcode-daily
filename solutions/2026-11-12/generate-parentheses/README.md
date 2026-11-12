# generate-parentheses

[Original practice problem](https://leetcode.com/problems/generate-parentheses/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using a backtracking approach. We maintain counts of open and close parentheses used so far. The `backtrack` function recursively builds valid parenthesis sequences. At each step, we have two choices: add an opening parenthesis or add a closing parenthesis. An opening parenthesis can be added if the `openCount` is less than `n`. A closing parenthesis can be added if the `closeCount` is less than `openCount` (to ensure well-formedness). The base case is when the current string length reaches `2 * n`, at which point a valid combination is found and added to the result list. After each recursive call, we backtrack by removing the last added character to explore other possibilities. Time complexity is O(C_n * 2n), where C_n is the nth Catalan number (number of valid parenthesis sequences), as we generate C_n strings each of length 2n. Space complexity is O(C_n * 2n) for storing the results, plus O(2n) for the recursion stack depth.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
