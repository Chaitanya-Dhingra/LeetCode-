package BinarySearch;

import java.util.Arrays;

public class singleElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        int single=singleNonDuplicate(arr);
        System.out.println(single);
        int singleb=singleNonDuplicateBit(arr);
        System.out.println(singleb);
    }
    // Binary Search Approach Time Complexity- O(log N)
    public static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid+1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }


    //Bit Manipulation Approach Time Complexity- O(N)
    public static int singleNonDuplicateBit(int[] nums) {
        int ans=0;
        for(int num: nums)
        {
            ans^=num;
        }
        return ans;
    }
}
