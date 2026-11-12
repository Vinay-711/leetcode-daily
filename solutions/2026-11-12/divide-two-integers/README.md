# divide-two-integers

[Original practice problem](https://leetcode.com/problems/divide-two-integers/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem requires integer division without using multiplication, division, or modulo operators, handling 32-bit integer range and specific overflow rules for the quotient. The approach involves determining the sign of the result first. To avoid overflow issues with `Integer.MIN_VALUE` (whose absolute value `2^31` cannot be represented as a positive `int`), both `dividend` and `divisor` are converted to `long` and then made negative. This allows working with the full range of `long` negative numbers `[-2^63, -1]`. The core division is performed by repeatedly subtracting multiples of the `divisor` (which are powers of 2) from the `dividend`. An inner loop efficiently finds the largest `k` such that `divisor * 2^k` (represented as `tempDivisor`) can be subtracted from the current `dividend`. The `tempDivisor` is doubled (left-shifted) as long as it remains less than or equal to the `dividend` (in magnitude, since both are negative) and does not overflow to a positive `long`. The corresponding `multiple` (initially 1, also doubled) is added to the `quotient`. After the main loop, the correct sign is applied to the `quotient`. Finally, the `quotient` is checked against `Integer.MAX_VALUE` and `Integer.MIN_VALUE` to handle potential 32-bit integer overflow as per problem rules, returning `Integer.MAX_VALUE` or `Integer.MIN_VALUE` if it exceeds the range. A special edge case `Integer.MIN_VALUE / -1` is handled upfront to directly return `Integer.MAX_VALUE` as specified. The time complexity is O(log(dividend/divisor)) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
