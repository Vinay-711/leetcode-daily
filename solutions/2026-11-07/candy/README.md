# candy

[Original practice problem](https://leetcode.com/problems/candy/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a two-pass greedy approach. First, we initialize an array of candies with 1s. We traverse from left to right, ensuring that if a child has a higher rating than the left neighbor, they get more candies than the left neighbor. Then, we traverse from right to left, ensuring that if a child has a higher rating than the right neighbor, they get more candies than the right neighbor (taking the maximum of the current value and the right neighbor's value + 1). Time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
