/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * Generated: 2026-11-05 01:03:05
 *
 * Approach:
 * The problem asks to find the first occurrence of a substring (needle) within another string (haystack). Java's `String.indexOf(String str)` method is perfectly suited for this task. It returns the starting index of the first occurrence of the specified substring, or -1 if the substring is not found. This method is highly optimized internally, often using efficient string searching algorithms (like a variant of Boyer-Moore), making it very performant. The time complexity for `String.indexOf()` is typically much better than a naive O(H*N) approach, often closer to O(H+N) or O(H) on average, where H is the length of haystack and N is the length of needle. The space complexity is O(1) as it uses a constant amount of extra space.
 * ==============================================================================
 */

class Solution {public int strStr(String haystack, String needle) {return haystack.indexOf(needle);}}
