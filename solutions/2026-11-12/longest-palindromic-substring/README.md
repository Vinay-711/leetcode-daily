# longest-palindromic-substring

[Original practice problem](https://leetcode.com/problems/longest-palindromic-substring/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution uses the "Expand Around Center" approach. This method iterates through each character in the string, treating it as a potential center of a palindromic substring. For each character, it considers two cases: 1) The character itself is the center (for odd-length palindromes, e.g., "aba"). 2) The character and its immediate right neighbor form the center (for even-length palindromes, e.g., "abba"). A helper function `expandAroundCenter` is used to expand outwards from these potential centers, checking for character equality. It continues expanding as long as the characters match and are within string bounds. The length of the palindrome found is calculated, and if it's longer than the current maximum, the maximum length and its starting index are updated. Finally, the substring corresponding to the longest palindrome found is returned. This approach has a time complexity of O(N^2) because there are 2N-1 possible centers, and expanding from each center can take up to O(N) time. The space complexity is O(1) as only a few variables are used to store the current maximum length and start index.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
