# summary-ranges

[Original practice problem](https://leetcode.com/problems/summary-ranges/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The algorithm iterates through the sorted array once, maintaining a start pointer. When the next element is not consecutive to the current one, it closes the current range and starts a new one. Time complexity is O(n) and space complexity is O(n) to store the result list.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
