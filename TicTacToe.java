public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static boolean checkWinner(char player) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        // Diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        // Other diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        board[0][0] = 'X';
        board[0][1] = 'X';
        board[0][2] = 'X';

        if (checkWinner('X')) {
            System.out.println("X wins");
        } else {
            System.out.println("No winner");
        }
    }
}