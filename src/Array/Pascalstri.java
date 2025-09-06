package Array;

import java.util.*;
public class Pascalstri {
    public static void main(String[] args) {
        int rows = 14;
        List<List<Integer>> arr = generate(rows);
        for (List<Integer> row : arr) {
            System.out.println(row);
        }
    }
    public static List<List<Integer>> generate(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<rows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                List<Integer> prevRow=triangle.get(i-1);
                row.add(prevRow.get(j)+prevRow.get(j-1));
            }
            if(i>0)
            {
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}

