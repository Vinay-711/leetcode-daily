# contains-duplicate-ii

[Original practice problem](https://leetcode.com/problems/contains-duplicate-ii/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a HashMap to store the last seen index of each element. As I iterate through the array, I check if the current element exists in the map and if the difference between the current index and the stored index is less than or equal to k. This approach has O(n) time complexity and O(min(n, k)) space complexity.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
