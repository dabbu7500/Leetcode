class Solution {
    static boolean f;

    public void solveSudoku(char[][] board) {
        f = true;
        sudoku(board, 0, 0);
    }

    static void sudoku(char[][] board, int r, int c) {

        if (c == board.length) {
            c = 0;
            r++;
        }
        if (r == board.length) {
            f = false;
            return;
        }
        if (board[r][c] != '.') {
            sudoku(board, r, c + 1);

        }

        else {
            for (int i = 1; i <= 9; i++) {
                if (isItSafe(board, r, c, i)) {
                    board[r][c] = (char) (i + '0');

                    sudoku(board, r, c + 1);
                    if (f) {
                       board[r][c] = '.';
                    }
                   

                }
            }
        }
    }

    static boolean isItSafe(char[][] board, int r, int c, int val) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] - '0' == val)
                return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][c] - '0' == val)
                return false;
        }

        int startRow = r - (r % 3);
        int startCol = c - (c % 3);
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if (board[i][j] - '0' == val)
                    return false;
            }
        }

        return true;
    }

}