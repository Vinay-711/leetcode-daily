# single-number

[Original practice problem](https://leetcode.com/problems/single-number/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using the XOR bitwise operator. XORing a number with itself results in 0, and XORing a number with 0 results in the number itself. Since XOR is commutative and associative, XORing all numbers in the array will cancel out all pairs, leaving only the single number. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
