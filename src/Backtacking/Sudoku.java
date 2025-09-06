package Backtacking;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
        display(board);
    }

    public static void solveSudoku(char[][] board) {
        isSolved(board);
    }

    public static boolean isSolved(char[][] board) {
        int n = board.length;
        int row=-1, col=-1;
        boolean isEmpty=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') {
                    row=i; col=j;
                    isEmpty=true;
                    break;
                }
            }
            if(isEmpty) break;
        }
        if(!isEmpty) return true;

        for(int num=1;num<=9;num++)
        {
            if(isSafe(board,row,col,num))
            {
                board[row][col]= Character.forDigit(num,10);
                if(isSolved(board)) return true;
                board[row][col]= '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==Character.forDigit(num,10)) return false;
        }

        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==Character.forDigit(num,10)) return false;
        }

        int sqrt=(int) Math.sqrt(board.length);
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++)
        {
            for (int j = colStart; j <colStart+sqrt ; j++) {
                if(board[i][j]==Character.forDigit(num,10)) return false;
            }
        }
        return true;
    }

    public static void display(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
