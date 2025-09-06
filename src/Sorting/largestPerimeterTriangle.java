package Sorting;

import java.util.Arrays;

public class largestPerimeterTriangle {
    public static void main(String[] args) {
        int[][] nums={
                {2,1,2},
                {1,2,1,10}
        };
        for(int[] num: nums)
        {
            System.out.println(largestPerimeter(num));
        }
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i=nums.length-1; i>1; i--)
        {
            if(nums[i]<nums[i-1]+nums[i-2])
            {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}
