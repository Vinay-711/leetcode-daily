# student-attendance-record-ii

[Original practice problem](https://leetcode.com/problems/student-attendance-record-ii/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use dynamic programming to track the state (number of absences, number of consecutive lates). Let dp[i][a][l] be the number of valid records of length i with 'a' absences and 'l' consecutive lates. Since we only need the previous day's state, we optimize space to O(1) by using a 2D array of size 2x3. The time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
