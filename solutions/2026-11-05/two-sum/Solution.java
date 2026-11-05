/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/two-sum/
 * Generated: 2026-11-05 00:51:04
 *
 * Approach:
 * The problem asks to find two indices in an array `nums` that sum up to a given `target`. We can solve this efficiently using a HashMap. We iterate through the array, and for each number `nums[i]`, we calculate the `complement` needed (`target - nums[i]`). We then check if this `complement` already exists as a key in our HashMap. If it does, we've found our pair: the current index `i` and the index stored in the map for the `complement`. If the `complement` is not in the map, we add the current number `nums[i]` and its index `i` to the map for future lookups. Since the problem guarantees exactly one solution, we will always find a pair and return. This approach has a time complexity of O(n) because we iterate through the array once, and HashMap operations (put and get) take O(1) on average. The space complexity is O(n) in the worst case, as the HashMap might store up to n elements.
 * ==============================================================================
 */

import java.util.HashMap;class Solution {    public int[] twoSum(int[] nums, int target) {        HashMap<Integer, Integer> numMap = new HashMap<>();        for (int i = 0; i < nums.length; i++) {            int complement = target - nums[i];            if (numMap.containsKey(complement)) {                return new int[]{numMap.get(complement), i};            }            numMap.put(nums[i], i);        }        // As per problem statement, each input has exactly one solution,        // so this line will not be reached.        return new int[]{};    }}
