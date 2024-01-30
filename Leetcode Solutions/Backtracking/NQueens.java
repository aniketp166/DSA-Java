package Backtracking;

public class NQueens {
    public static void nQueens(int n) {
        nQueens(new int[n][n], 0);
    }

    public static boolean isSafe(int row, int col, int board[][]) {
        // check for the vertical direction
        for (int r = 0; r <= row; r++) {
            if (board[r][col] == 1) {
                return false;
            }

        }

        // check for positive diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 1) {
                return false;
            }
        }

        // negative diagonal
        for (int r = row, c = col; r >= 0 && c < board[0].length; r--, c++) {
            if (board[r][c] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(int board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 1;
                nQueens(board, row + 1);
                board[row][col] = 0;
            }

        }
    }

    public static void printBoard(int board[][]) {
        System.out.println("===========");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("===========");
    }

    public static void main(String[] args) {
        nQueens(4);
    }
}