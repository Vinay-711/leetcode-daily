# ==============================================================================
# Platform: LeetCode
# URL: https://leetcode.com/problems/roman-to-integer/
# Generated: 2026-11-05 00:39:33
#
# Approach:
# The approach involves iterating through the Roman numeral string from left to right. A dictionary maps each Roman symbol to its integer value. For each character, we compare its value with the value of the next character. If the current character's value is less than the next character's value (e.g., 'I' before 'V' in 'IV'), it signifies a subtractive case, and the current character's value is subtracted from the total. Otherwise (if the current character's value is greater than or equal to the next, or if it's the last character), its value is added to the total. This correctly handles both additive and subtractive rules of Roman numerals.

Time Complexity: O(N), where N is the length of the input string `s`. We iterate through the string once, and dictionary lookups take O(1) time on average.
Space Complexity: O(1), as the dictionary storing Roman symbol values has a fixed size (7 entries) regardless of the input string length.
# ==============================================================================

class Solution:
    def romanToInt(self, s: str) -> int:
        roman_map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        total = 0
        n = len(s)

        for i in range(n):
            current_value = roman_map[s[i]]
            # If the current symbol's value is less than the next symbol's value,
            # it means we have a subtractive case (e.g., IV, IX, XL, etc.).
            # In such cases, we subtract the current value.
            if i + 1 < n and current_value < roman_map[s[i+1]]:
                total -= current_value
            # Otherwise, we add the current value.
            else:
                total += current_value
        
        return total
