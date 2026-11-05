# ==============================================================================
# Platform: LeetCode
# URL: https://leetcode.com/problems/two-sum/
# Generated: 2026-11-05 00:38:05
#
# Approach:
# The problem asks us to find two distinct indices in an array `nums` whose corresponding values sum up to a given `target`. We are guaranteed that exactly one solution exists and we cannot use the same element twice. A brute-force approach using nested loops would take O(n^2) time, which is too slow for the given constraints (n up to 10^4). A more efficient approach uses a hash map (dictionary in Python) to achieve O(n) time complexity.

The algorithm iterates through the `nums` array once, keeping track of numbers encountered so far and their indices in a hash map. For each number `num` at index `i`:
1. Calculate the `complement` needed: `complement = target - num`.
2. Check if this `complement` already exists as a key in the hash map. If it does, it means we have found the two numbers that sum to `target`. The index of the `complement` is stored in the hash map, and the current number's index is `i`. We return `[hash_map[complement], i]`.
3. If the `complement` is not in the hash map, we add the current number `num` and its index `i` to the hash map. This makes `num` available as a complement for subsequent numbers in the array.

Since each lookup and insertion in a hash map takes O(1) time on average, and we iterate through the array once, the overall time complexity is O(n). The space complexity is O(n) in the worst case, as the hash map might store all elements if the solution pair is found towards the end of the array.
# ==============================================================================

class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # A dictionary to store numbers and their indices encountered so far.
        # Key: number, Value: index
        num_map = {}

        # Iterate through the array with both index and value.
        for i, num in enumerate(nums):
            # Calculate the complement needed to reach the target.
            complement = target - num

            # Check if the complement is already in our map.
            # If it is, we have found the two numbers.
            if complement in num_map:
                # Return the index of the complement (from the map) and the current index.
                return [num_map[complement], i]
            
            # If the complement is not found, add the current number and its index
            # to the map for future lookups.
            num_map[num] = i
        
        # According to the problem constraints, there will always be exactly one solution.
        # Therefore, this line should theoretically never be reached.
        # If it were possible for no solution to exist, one might raise an error or return an empty list.
