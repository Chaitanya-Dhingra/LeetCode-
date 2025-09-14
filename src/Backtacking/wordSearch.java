    package Backtacking;

    public class wordSearch {
        public static void main(String[] args) {
            char[][] board={
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}
            };
            String[] words={"ABCCED","SEE","ABCB"};
            for(String word: words)
            {
                System.out.println(exist(board,word));
            }
        }

        public static boolean exist(char[][] board,String word)
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[i].length;j++)
                {
                    if(board[i][j]==word.charAt(0) && checkword(board,word,i,j,0))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean checkword(char[][] board, String target, int r, int c, int index)
        {
            if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='*' || board[r][c]!=target.charAt(index)) return false;
            if(index==target.length()-1) return true;

            char ch = board[r][c];
            board[r][c]='*';
            boolean res= checkword(board,target,r+1,c,index+1) ||
                    checkword(board,target,r-1,c,index+1) ||
                    checkword(board,target,r,c+1,index+1) ||
                    checkword(board,target,r,c-1,index+1);
            board[r][c]=ch;
            return res;
        }
    }
