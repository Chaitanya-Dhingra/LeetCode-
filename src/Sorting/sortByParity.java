package Sorting;

import java.util.Arrays;

public class sortByParity {
    public static void main(String[] args) {
        int[][] nums={
                {3,1,2,4},
                {0},
                {0,2}
        };
        for(int[] num: nums)
        {
            System.out.println(Arrays.toString(sortArrayByParity(num)));
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int start=0, end=nums.length-1;
        while(start<end)
        {
            if((nums[start]&1)==1)
            {
                if((nums[end]&1)==0)
                {
                    int temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++; end--;
                }
                else
                {
                    end--;
                }
            }
            else{
                start++;
            }
        }
        return nums;
    }
}
