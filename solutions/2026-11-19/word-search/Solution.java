import java.util.*;

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] w = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, w, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, char[] w, int idx) {
        if (idx == w.length) {
            return true;
        }
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != w[idx]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#'; // mark as visited
        boolean found = dfs(board, i + 1, j, w, idx + 1)
                     || dfs(board, i - 1, j, w, idx + 1)
                     || dfs(board, i, j + 1, w, idx + 1)
                     || dfs(board, i, j - 1, w, idx + 1);
        board[i][j] = temp; // restore original letter
        return found;
    }
}