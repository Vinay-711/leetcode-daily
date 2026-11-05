# rotate-image

[Original practice problem](https://leetcode.com/problems/rotate-image/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To rotate the matrix 90 degrees clockwise in-place, we perform two steps: first, transpose the matrix (swap matrix[i][j] with matrix[j][i]), and second, reverse each row. This approach has a time complexity of O(n^2) and a space complexity of O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
