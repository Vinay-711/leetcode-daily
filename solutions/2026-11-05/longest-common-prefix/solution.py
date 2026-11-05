# ==============================================================================
# Platform: LeetCode
# URL: https://leetcode.com/problems/longest-common-prefix/
# Generated: 2026-11-05 00:40:21
#
# Approach:
# The solution employs a vertical scanning approach to find the longest common prefix. It first handles edge cases: if the input list of strings is empty, it returns an empty string; if it contains only one string, that string is the prefix. Otherwise, it iterates through the characters of the first string one by one. For each character at index `i`, it compares it with the character at the same index `i` in all other strings. If at any point a string is shorter than `i` (meaning `i` is out of bounds for that string) or the character at index `i` in another string does not match the character from the first string, it means the common prefix ends just before this character. In this scenario, the function returns the substring of the first string from its beginning up to index `i`. If the outer loop completes without returning, it implies that the entire first string is a common prefix to all other strings, so the first string itself is returned. This approach ensures correctness for various inputs, including those with empty strings. Time Complexity: O(M*N), where N is the number of strings and M is the length of the shortest string. In the worst case, M can be the length of the first string. Space Complexity: O(1) (excluding the space for the output string).
# ==============================================================================

class Solution:    def longestCommonPrefix(self, strs: list[str]) -> str:        if not strs: return ""        if len(strs) == 1: return strs[0]        for i in range(len(strs[0])):            char = strs[0][i]            for j in range(1, len(strs)):                if i == len(strs[j]) or strs[j][i] != char: return strs[0][:i]        return strs[0]
