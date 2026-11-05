# product-of-array-except-self

[Original practice problem](https://leetcode.com/problems/product-of-array-except-self/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use two passes to calculate the product of all elements except the current one. First, we compute prefix products in the result array. Then, we iterate backwards, maintaining a running suffix product to multiply with the existing prefix products. This achieves O(n) time complexity and O(1) extra space complexity (excluding the output array).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
