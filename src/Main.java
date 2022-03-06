import java.io.Console;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        board.depthFirstSearch();
        printBoard(board);
    }

    public static void printBoard(Board board){
        for (int i = 0; i<5 ;i++){
            for (int j = 0; j<5;j++){
                System.out.print(board.board[i][j]);
            }
            System.out.println();
        }
    }
}

