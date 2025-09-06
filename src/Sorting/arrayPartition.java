package Sorting;

import java.util.Arrays;

public class arrayPartition {
    public static void main(String[] args) {
        int[][] nums={{1,4,3,2},{6,2,6,5,1,2}};
        for(int[] num: nums)
        {
            System.out.println(arrayPairSum(num));
        }
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
}
