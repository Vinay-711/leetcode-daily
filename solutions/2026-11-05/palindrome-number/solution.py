# ==============================================================================
# Platform: LeetCode
# URL: https://leetcode.com/problems/palindrome-number/
# Generated: 2026-11-05 00:38:51
#
# Approach:
# The solution first handles edge cases: negative numbers and positive numbers ending in zero (except for 0 itself) are not palindromes. For other numbers, it iteratively builds a 'reverted_number' by taking digits from the end of the original number 'x' and appending them. This process continues until 'reverted_number' becomes greater than or equal to 'x', effectively reversing only half of the digits. Finally, it checks if 'x' is equal to 'reverted_number' (for even-digit numbers) or 'reverted_number // 10' (for odd-digit numbers, where the middle digit is effectively ignored in 'reverted_number'). This approach avoids converting the integer to a string and prevents potential integer overflow by not fully reversing the number. Time complexity: O(log10(x)) as we process each digit once. Space complexity: O(1) as only a few extra variables are used.
# ==============================================================================

class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Special cases:
        # 1. Negative numbers are not palindromes.
        #    e.g., -121 reads as -121 from left to right, but 121- from right to left.
        if x < 0:
            return False

        # 2. Numbers ending in 0 (except for 0 itself) are not palindromes.
        #    e.g., 10 reads as 10 from left to right, but 01 from right to left.
        #    If a number is a palindrome and ends in 0, it must also start with 0.
        #    The only number that satisfies this is 0 itself.
        if x % 10 == 0 and x != 0:
            return False

        # Revert the second half of the number.
        # We build `reverted_number` by taking digits from the end of `x`
        # and appending them to `reverted_number`.
        # We stop when `reverted_number` becomes greater than or equal to `x`.
        reverted_number = 0
        while x > reverted_number:
            reverted_number = reverted_number * 10 + (x % 10)
            x //= 10

        # When the loop terminates, we have two cases:
        # 1. The original number had an even number of digits.
        #    In this case, `x` and `reverted_number` should be equal.
        #    Example: x = 1221
        #    - Initial: x=1221, reverted_number=0
        #    - 1st iter: x=122, reverted_number=1
        #    - 2nd iter: x=12, reverted_number=12
        #    Loop terminates because x (12) is not > reverted_number (12).
        #    Here, x == reverted_number (12 == 12).

        # 2. The original number had an odd number of digits.
        #    In this case, `x` will be the middle digit, and `reverted_number`
        #    will contain the reversed second half plus the middle digit.
        #    To check for palindrome, we need to remove the middle digit from
        #    `reverted_number` (by `reverted_number // 10`) and then compare it with `x`.
        #    Example: x = 121
        #    - Initial: x=121, reverted_number=0
        #    - 1st iter: x=12, reverted_number=1
        #    - 2nd iter: x=1, reverted_number=12
        #    Loop terminates because x (1) is not > reverted_number (12).
        #    Here, x (1) == reverted_number // 10 (12 // 10 = 1).

        return x == reverted_number or x == reverted_number // 10
