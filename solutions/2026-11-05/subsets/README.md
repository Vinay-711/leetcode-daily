# subsets

[Original practice problem](https://leetcode.com/problems/subsets/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a backtracking approach to generate all possible subsets. For each element, we have two choices: either include it in the current subset or exclude it. This results in a time complexity of O(n * 2^n) where n is the number of elements, as there are 2^n subsets and each takes O(n) to copy. The space complexity is O(n) for the recursion stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
