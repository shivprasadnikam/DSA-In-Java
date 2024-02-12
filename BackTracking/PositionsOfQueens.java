package BackTracking;

public class PositionsOfQueens {
    public static void permute() {

    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int boardSize = 2;
        char[][] chessBoard = new char[boardSize][boardSize];
        // Inserting elements into chessBoard
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        permute();
        printBoard(chessBoard);

    }

}
