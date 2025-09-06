package Array;

import java.util.ArrayList;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] arr={2,2,1,3};
        ArrayList<Integer> list=majorityElement(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> major=new ArrayList<>();
        int c1=0, c2=0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && el2!=nums[i])
            {
                c1=1; el1=nums[i];
            }
            else if(c2==0 && el1!=nums[i])
            {
                c2=1; el2=nums[i];
            }
            else if(nums[i]==el1) c1++;
            else if(nums[i]==el2) c2++;
            else {
                c1--; c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (el1 != 0 && num == el1) c1++;
            else if (el2 != 0 && num == el2) c2++;
        }

        int n = nums.length;
        if (c1 > n / 3) major.add(el1);
        if (c2 > n / 3) major.add(el2);
        return major;
    }
}
