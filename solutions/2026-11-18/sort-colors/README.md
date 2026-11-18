# sort-colors

[Original practice problem](https://leetcode.com/problems/sort-colors/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

We apply the Dutch National Flag algorithm with three pointers: low (next position for 0), mid (current element), and high (next position for 2). Elements before low are 0, between low and mid are 1, after high are 2, and the region mid..high is unsorted. By swapping and moving pointers we sort the array in a single pass. Time complexity O(n), space complexity O(1).

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
