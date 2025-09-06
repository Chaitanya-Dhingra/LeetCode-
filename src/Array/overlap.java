package Array;

import java.util.*;
public class overlap {
    public static void main(String[] args) {
        int[][] intervals={{1,4},{0,2},{3,5}};
        int[][] merged=merge(intervals);
        System.out.println(Arrays.deepToString(merged));
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> over=new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        for(int[] interval:intervals){
            if(over.isEmpty())
            {
                over.add(new int[]{interval[0],interval[1]});
            }
            else
            {
                if(over.get(over.size()-1)[1]>=interval[0])
                {
                    over.get(over.size() - 1)[1]=Math.max(over.get(over.size()-1)[1],interval[1]);
                }
                else {
                    over.add(interval);
                }
            }
        }
        return over.toArray(new int[over.size()][]);
    }
}
