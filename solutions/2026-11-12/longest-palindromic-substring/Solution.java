class Solution {
    private int maxLen = 0;
    private int start = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        maxLen = 1;
        start = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome, with s[i] as the center.
            expandAroundCenter(s, i, i);

            // Case 2: Even length palindrome, with s[i] and s[i+1] as the center.
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private void expandAroundCenter(String s, int left, int right) {
        // Expand as long as the pointers are within bounds and characters match.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // At this point, 'left' and 'right' are one step *outside* the actual palindrome.
        // The palindrome starts at (left + 1) and ends at (right - 1).
        // Its length is (right - 1) - (left + 1) + 1 = right - left - 1.
        int currentLen = right - left - 1;

        // If the current palindrome is longer than the longest found so far, update.
        if (currentLen > maxLen) {
            maxLen = currentLen;
            start = left + 1; // Update the start index of the longest palindrome.
        }
    }
}