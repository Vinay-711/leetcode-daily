# implement-queue-using-stacks

[Original practice problem](https://leetcode.com/problems/implement-queue-using-stacks/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use two stacks: 'input' for pushing elements and 'output' for popping/peeking. When pop or peek is called and the 'output' stack is empty, we transfer all elements from 'input' to 'output', effectively reversing their order to FIFO. Amortized time complexity is O(1) per operation, and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
