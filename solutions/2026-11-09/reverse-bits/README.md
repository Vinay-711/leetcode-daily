# reverse-bits

[Original practice problem](https://leetcode.com/problems/reverse-bits/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution iterates through all 32 bits of the input integer. In each iteration, it shifts the result to the left to make room for the next bit, extracts the least significant bit of the input using a bitwise AND, and adds it to the result. The input is then shifted right. Time complexity is O(1) as it always performs 32 iterations, and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
