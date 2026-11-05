# word-break

[Original practice problem](https://leetcode.com/problems/word-break/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used dynamic programming with a boolean array dp of size n+1, where dp[i] indicates if the substring s[0...i-1] can be segmented into dictionary words. For each position i, I check all possible previous positions j such that s[j...i-1] exists in the dictionary. The time complexity is O(n * m * k) where n is the length of s, m is the number of words, and k is the average length of words, and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
