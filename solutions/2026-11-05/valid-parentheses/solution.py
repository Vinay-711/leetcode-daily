# ==============================================================================
# Platform: LeetCode
# URL: https://leetcode.com/problems/valid-parentheses/
# Generated: 2026-11-05 00:40:59
#
# Approach:
# The problem requires checking if a string containing parentheses '()[]{}' is valid. A string is valid if open brackets are closed by the same type of brackets, in the correct order, and every close bracket has a corresponding open bracket. This is a classic problem solvable using a stack data structure. We iterate through the input string character by character. If we encounter an opening bracket ('(', '[', '{'), we push it onto the stack. If we encounter a closing bracket (')', ']', '}'), we check two conditions: 1) If the stack is empty, it means there's no corresponding open bracket, so the string is invalid. 2) If the stack is not empty, we pop the top element and compare it with the expected opening bracket for the current closing bracket (e.g., ')' expects '('). If they don't match, the string is invalid. After processing all characters, if the stack is empty, it means all opening brackets have been correctly closed, and the string is valid. Otherwise, if the stack is not empty, there are unclosed opening brackets, making the string invalid. A dictionary is used to quickly map closing brackets to their corresponding opening brackets.
# ==============================================================================

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        # Map closing brackets to their corresponding opening brackets
        mapping = {
            ')': '(',
            ']': '[',
            '}': '{'
        }

        for char in s:
            if char in mapping:  # It's a closing bracket
                # If stack is empty, no matching open bracket found.
                # Or if the top of the stack doesn't match the expected open bracket.
                # The 'not stack' check must come first to prevent IndexError on an empty stack.
                if not stack or stack.pop() != mapping[char]:
                    return False
            else:  # It's an opening bracket
                stack.append(char)
        
        # After iterating through all characters, if the stack is empty,
        # all opening brackets have been matched. Otherwise, there are unclosed brackets.
        return not stack
