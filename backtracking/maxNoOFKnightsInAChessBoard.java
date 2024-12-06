package backtracking;

public class maxNoOFKnightsInAChessBoard {
    static int max = -1; //gloabal variable bcoz static is used, now this variable can be used any where
   static int number=8;
    public static boolean isSafe(char grid[][],int row, int col){
        //base case
        int n = grid.length;
        int i , j;
        //2 up i right
        i= row-2;
        j= col+1;
        if(i>=0 && j<n && grid[i][j]=='K') return false;

        //2 up 1 left
        i= row-2;
        j= col-1;
        if(i>=0 && j>=0 && grid[i][j]=='K') return false;

        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]=='K') return false;

        //2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]=='K') return false;

        //2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]=='K') return false;

        //2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]=='K') return false;;

        //2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]=='K') return false;

        //2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]=='K') return false;

        return true;
    }
    public static void nKnight(char[][] board, int row, int col, int num){
        int n = board.length;
        //base case
        if (row == n) {
            if(num==number){
                for(int i =0;i<n;i++){
                    for(int j =0;j<n;j++){
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return;
        }

        else if(isSafe(board,row , col)){
            board[row][col]='K';
            if(col!=n-1) nKnight(board,row,col+1,num+1);
            else nKnight(board,row+1,0,num+1);
            board[row][col]='x'; //backtracking
        }
        if(col!=n-1)  nKnight(board,row+1,col,num);
        else nKnight(board,row+1,0,num+1);

    }
    public static void main(String[] args) {
         int n =4;
         char[][]board = new char[n][n];
         for(int i=0;i<n;i++){
             for(int j =0;j<n;j++){
                 board[i][j]='x';
             }
         }
         nKnight(board,0,0,0);
    }
}