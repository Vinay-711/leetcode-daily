# median-of-two-sorted-arrays

[Original practice problem](https://leetcode.com/problems/median-of-two-sorted-arrays/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use binary search on the smaller array to partition both arrays such that the left half contains half of the total elements. We ensure the partition satisfies the condition that all elements on the left are less than or equal to all elements on the right. Time complexity is O(log(min(m, n))) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
