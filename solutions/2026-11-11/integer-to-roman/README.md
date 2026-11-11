# integer-to-roman

[Original practice problem](https://leetcode.com/problems/integer-to-roman/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach uses two parallel arrays to store the Roman numeral symbols and their corresponding integer values in descending order, including the subtractive forms (like 900, 400, 90, 40, 9, 4). We iterate through these values, appending the symbol to a StringBuilder as many times as the current value fits into the remaining number. Time complexity is O(1) because the input is bounded (up to 3999), and space complexity is O(1) for the fixed-size mapping arrays.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
