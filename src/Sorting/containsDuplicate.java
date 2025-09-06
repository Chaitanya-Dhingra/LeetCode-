package Sorting;

import java.util.HashMap;

public class containsDuplicate {
    public static void main(String[] args) {
        int[][] nums={{1,2,3,1},{1,2,3,4},{1,1,1,3,3,4,3,2,4,2}};
        for(int[] num: nums)
        {
            System.out.println(containsDuplicates(num));
        }
    }

    public static boolean containsDuplicates(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i: nums)
        {
            if(map.getOrDefault(i,0)+1 >=2) return true;
            else map.put(i,map.getOrDefault(i,0)+1);
        }
        return false;
    }
}
