package Array;
import java.util.*;
public class Setzeros {
    public static void main(String[] args) {
        int[][]matrix={{1,1,1},{1,0,1},{1,1,1}};
        int[][]zeroMatrix=setZero(matrix);
        System.out.println(Arrays.deepToString(zeroMatrix));
    }
    public static int[][] setZero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows=new int[m];
        Arrays.fill(rows, -1);
        int[] cols=new int[n];
        Arrays.fill(cols, -1);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=i;
                    cols[j]=j;
                }
            }
        }
        for(int row:rows)
        {
            for(int j=0;j<n;j++)
            {
                if(row!=-1){
                matrix[row][j]=0;}
            }
        }
        for(int col:cols)
        {
            for(int i=0;i<m;i++)
            {
                if(col!=-1){
                matrix[i][col]=0;}
            }
        }
        return matrix;
    }
}
