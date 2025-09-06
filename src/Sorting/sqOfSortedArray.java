package Sorting;

import java.util.Arrays;

public class sqOfSortedArray {
    public static void main(String[] args) {
        int[][] nums={
                {-4,-1,0,3,10},
                {-7,-3,2,3,11},
                {-5,-3,-2,-1}
        };
        for(int[] num: nums)
        {
            System.out.println(Arrays.toString(sortedSquares(num)));
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int start=0, end=n-1, index=n-1;
        while(start<=end)
        {
            int startSq=nums[start]*nums[start];
            int endSq=nums[end]*nums[end];
            if(startSq>endSq)
            {
                res[index--]=startSq;
                start++;
            }
            else
            {
                res[index--]=endSq;
                end--;
            }
        }
        return res;
    }
}
