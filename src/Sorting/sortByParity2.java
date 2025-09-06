package Sorting;

import java.util.Arrays;

public class sortByParity2 {
    public static void main(String[] args) {
        int[][] nums={
                {4,2,5,7},
                {2,3},
                {3,4},
                {2,3,1,1,4,0,0,4,3,3}
        };
        for(int[] num: nums)
        {
            System.out.println(Arrays.toString(sortArrayByParityII(num)));
        }
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;

        while (even < nums.length && odd < nums.length) {
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < nums.length && nums[odd] % 2 == 1) {
                odd += 2;
            }

            if (even < nums.length && odd < nums.length) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }

        return nums;
    }
}
