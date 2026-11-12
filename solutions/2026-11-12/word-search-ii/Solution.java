import java.util.ArrayList;
import java.util.List;

class Solution {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode node = root;
            for (char c : w.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.word = w;
        }

        List<String> result = new ArrayList<>();
        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                dfs(board, r, c, root, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int r, int c, TrieNode p, List<String> result) {
        char ch = board[r][c];
        if (ch == '#' || p.children[ch - 'a'] == null) {
            return;
        }

        p = p.children[ch - 'a'];
        if (p.word != null) {
            result.add(p.word);
            p.word = null;
        }

        board[r][c] = '#';

        if (r > 0) dfs(board, r - 1, c, p, result);
        if (r < board.length - 1) dfs(board, r + 1, c, p, result);
        if (c > 0) dfs(board, r, c - 1, p, result);
        if (c < board[0].length - 1) dfs(board, r, c + 1, p, result);

        board[r][c] = ch;
    }
}