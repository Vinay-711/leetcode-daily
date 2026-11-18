# permutations-ii

[Original practice problem](https://leetcode.com/problems/permutations-ii/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

The problem asks for all unique permutations of a given array `nums` that may contain duplicate numbers. We use a backtracking approach to generate permutations. To handle duplicates and ensure uniqueness, we first sort the input array `nums`. This brings identical elements together, which is crucial for our duplicate-skipping logic. The `backtrack` function recursively builds permutations. It maintains a `currentPermutation` list and a `boolean[] used` array to track which elements have been included in the current path. The base case is when `currentPermutation` reaches the length of `nums`, at which point a copy is added to the `result` list. In the recursive step, we iterate through `nums`. We skip an element if it's already `used`. The key for handling duplicates is: if `nums[i]` is the same as `nums[i-1]` AND `nums[i-1]` was NOT used (`!used[i-1]`), we skip `nums[i]`. This condition ensures that for duplicate numbers, we only consider the first available instance to start a permutation, preventing redundant permutations (e.g., for `[1,1,2]`, we don't want to generate `[1_second, 1_first, 2]` if `[1_first, 1_second, 2]` has already been or will be generated). After choosing an element, we recurse, and then backtrack by unchoosing it. The time complexity is dominated by generating permutations, which is roughly O(N! * N) in the worst case (where N is the length of `nums`), as there can be up to N! permutations, and each takes O(N) to build and copy. The space complexity is O(N) for the recursion stack, `currentPermutation`, and `used` array, plus O(N * N!) for storing the `result` list.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
