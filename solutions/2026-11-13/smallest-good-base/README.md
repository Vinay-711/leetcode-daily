# smallest-good-base

[Original practice problem](https://leetcode.com/problems/smallest-good-base/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To find the smallest good base k of n, we want to maximize the number of 1's in base k representation, say length m. The value of n in base k with length m is 1 + k + k^2 + ... + k^(m-1) = n. Since n <= 10^18 and k >= 2, the maximum possible length m is around 63 (since 2^63 > 10^18). We can iterate m from 63 down to 3. For a fixed m, we use binary search to find if there exists an integer base k >= 2 such that sum_{i=0}^{m-1} k^i == n. The upper bound for binary search can be set using n^(1/(m-1)). If no k is found for m >= 3, the answer is n - 1 (corresponding to m = 2). Time complexity is O(log^3 n), and Space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
