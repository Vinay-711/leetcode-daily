# group-anagrams

[Original practice problem](https://leetcode.com/problems/group-anagrams/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We group anagrams using a HashMap where the key is the sorted version of each string and the value is a list of strings that match that sorted key. Since anagrams have the exact same characters in equal frequencies, their sorted representations are identical.

Time Complexity: O(N * K log K), where N is the number of strings and K is the maximum length of a string in strs. Sorting each string of length at most 100 takes minimal time.
Space Complexity: O(N * K) to store the grouped strings in the HashMap and result list.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
