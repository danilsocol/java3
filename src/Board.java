import java.util.Stack;

public class Board {

    public static char[][] board = {
            {'#','s','#','#','#'},
            {'#','.','.','.','#'},
            {'.','.','#','.','#'},
            {'.','#','.','.','#'},
            {'#','#','#','.','f'}
    };

    public static char[][] way;

    public static int[] start;
    public static int[] end;


    public Board(){
        int[][] startAndEnd =new int[2][];

        for (int i = 0; i< Math.sqrt(board.length);i++)
            for (int j = 0; j< Math.sqrt(board.length);j++){
                if (board[i][j] == 's')
                    start = new int[] {i,j};
                if(board[i][j] == 'f')
                    end = new int[] {i,j};
            }
    }

    public static void depthFirstSearch(){
        Stack<int[]> stack = new Stack<>();
        Stack<int[]> crossroad = new Stack<>();
        stack.push(start);
        char obj = board[start[0]][start[1]];

        while(obj != 'f'){
            int[] YX = stack.pop();

            int countTransitions = 0;
            int y = YX[0];
            int x = YX[1];
            obj = board[y][x];

            if(obj != 's')
                board[y][x] = '*';

            if(x!= 4 && (board[y][x+1] == '.'|| board[y][x+1] == 'f')){
                stack.push(new int[]{y,x+1});
                countTransitions++;
            }
            if(x != 0 && ( board[y][x-1] == '.'|| board[y][x-1] == 'f')){
                stack.push(new int[]{y,x-1});
                countTransitions++;
            }
            if(y!=4 && (board[y+1][x] == '.' || board[y+1][x] == 'f')){
                stack.push(new int[]{y+1,x});
                countTransitions++;
            }
            if(y!= 0 && (board[y-1][x] == '.'|| board[y-1][x] == 'f')){
                stack.push(new int[]{y-1,x});
                countTransitions++;
            }

            if(countTransitions>1)
                crossroad.push(new int[]{y,x});

            if(countTransitions==0)
                reverse(crossroad.pop(),YX);
        }
    }

    static void reverse(int[] crossroad,int[] position){
        while(position[0]!= crossroad[0] && position[1] != crossroad[1]){
           
        }
    }

    static void searchForTransition(){

    }
}
