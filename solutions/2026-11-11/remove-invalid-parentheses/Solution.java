import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        
        // Constraints: 1 <= s.length <= 25, so s is never null or empty.

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false; // Flag to indicate if we've found valid strings at the current BFS level

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String currentString = queue.poll();

                if (isValid(currentString)) {
                    result.add(currentString);
                    found = true; // Found valid strings at this level, so we've reached the minimum removals
                }

                // If valid strings are found at this level, we don't need to explore further
                // by removing more parentheses from currentString. We just collect all
                // valid strings at this minimum removal level.
                if (found) {
                    continue; 
                }

                // Generate all possible strings by removing one parenthesis
                for (int j = 0; j < currentString.length(); j++) {
                    char c = currentString.charAt(j);
                    // Only remove parentheses, not letters
                    if (c == '(' || c == ')') {
                        String nextString = currentString.substring(0, j) + currentString.substring(j + 1);
                        if (!visited.contains(nextString)) {
                            visited.add(nextString);
                            queue.offer(nextString);
                        }
                    }
                }
            }
            
            // If valid strings were found at this level, we stop the BFS.
            // This ensures that we only return strings with the minimum number of removals.
            if (found) {
                break;
            }
        }
        
        return result;
    }

    /**
     * Helper function to check if a string of parentheses is valid.
     * A string is valid if:
     * 1. The total number of '(' equals the total number of ')'.
     * 2. For any prefix of the string, the number of '(' is greater than or equal to the number of ')'.
     * Letters are ignored for validity check.
     */
    private boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            // If balance drops below zero, it means we have an unmatched ')'
            // (i.e., a ')' without a preceding '(').
            if (balance < 0) {
                return false;
            }
        }
        // For a valid string, the final balance must be zero.
        // (i.e., all '(' have been matched by a ')').
        return balance == 0;
    }
}