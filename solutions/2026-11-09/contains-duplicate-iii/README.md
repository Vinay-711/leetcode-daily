# contains-duplicate-iii

[Original practice problem](https://leetcode.com/problems/contains-duplicate-iii/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a TreeSet to maintain a sliding window of size indexDiff. For each element nums[i], we check if there exists an element in the set within the range [nums[i] - valueDiff, nums[i] + valueDiff] using the floor and ceiling methods. This approach has a time complexity of O(N log(min(N, indexDiff))) and space complexity of O(min(N, indexDiff)).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
