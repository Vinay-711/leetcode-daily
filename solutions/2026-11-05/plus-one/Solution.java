/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/plus-one/
 * Generated: 2026-11-05 01:04:31
 *
 * Approach:
 * The approach is to simulate the addition process from right to left (least significant digit to most significant digit). We iterate through the digits array starting from the last element. If a digit is less than 9, we simply increment it by one and return the modified array, as no further carry is needed. If a digit is 9, we set it to 0 and continue to the next digit to the left, effectively carrying over a 1. If we iterate through all digits and they were all 9s (e.g., [9,9,9]), then after setting all of them to 0, we will need to create a new array that is one element longer than the original. The first element of this new array will be 1 (the final carry-over), and the rest will be 0s.
 * ==============================================================================
 */

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the rightmost digit to the leftmost
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can simply increment it
            // and we are done, as there's no carry-over.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            // to the left, as there's a carry-over.
            digits[i] = 0;
        }

        // If the loop completes, it means all digits were 9s (e.g., [9], [9,9,9]).
        // In this case, we need a new array with an additional digit at the beginning.
        // For example, [9,9] becomes [1,0,0].
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The carry-over becomes the new most significant digit
        // The rest of the newDigits array will be 0s by default, which is correct.
        
        return newDigits;
    }
}
