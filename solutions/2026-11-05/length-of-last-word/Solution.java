/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/length-of-last-word/
 * Generated: 2026-11-05 01:04:05
 *
 * Approach:
 * The approach involves iterating through the string from right to left. First, we skip any trailing spaces to find the end of the last word. Then, we continue iterating leftwards, counting non-space characters until we encounter a space or reach the beginning of the string. This count represents the length of the last word. The problem guarantees at least one word in the string, so we don't need to handle cases where no word is found. This method avoids creating new strings or arrays, making it efficient.Time complexity is O(N) because we traverse the string at most once. Space complexity is O(1) as we only use a few integer variables.
 * ==============================================================================
 */

class Solution {public int lengthOfLastWord(String s) {int length = 0;int i = s.length() - 1;while (i >= 0 && s.charAt(i) == ' ') {i--;}while (i >= 0 && s.charAt(i) != ' ') {length++;i--;}return length;}}
