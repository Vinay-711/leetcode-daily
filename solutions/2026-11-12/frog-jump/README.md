# frog-jump

[Original practice problem](https://leetcode.com/problems/frog-jump/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used dynamic programming with a HashMap where the key is the stone index and the value is a HashSet of possible jump sizes that can land on that stone. This approach has a time complexity of O(n^2) because each stone can have at most n possible jump sizes, and we iterate through them. The space complexity is O(n^2) to store the jump sets for each stone.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
