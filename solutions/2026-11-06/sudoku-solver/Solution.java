class Solution {
    private int[] rows = new int[9];
    private int[] cols = new int[9];
    private int[] boxes = new int[9];

    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int val = board[r][c] - '1';
                    int mask = 1 << val;
                    rows[r] |= mask;
                    cols[c] |= mask;
                    boxes[(r / 3) * 3 + c / 3] |= mask;
                }
            }
        }
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int r, int c) {
        if (r == 9) return true;
        if (c == 9) return solve(board, r + 1, 0);
        if (board[r][c] != '.') return solve(board, r, c + 1);

        int boxIdx = (r / 3) * 3 + c / 3;
        int used = rows[r] | cols[c] | boxes[boxIdx];

        for (int val = 0; val < 9; val++) {
            int mask = 1 << val;
            if ((used & mask) == 0) {
                board[r][c] = (char) ('1' + val);
                rows[r] |= mask;
                cols[c] |= mask;
                boxes[boxIdx] |= mask;

                if (solve(board, r, c + 1)) return true;

                board[r][c] = '.';
                rows[r] &= ~mask;
                cols[c] &= ~mask;
                boxes[boxIdx] &= ~mask;
            }
        }
        return false;
    }
}
