package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4};
        nextPermutation(arr);
    }
    public static void nextPermutation(int[] nums) {
        boolean decrease= isDecreasing(nums);
        if(decrease){
            int start=0, end=nums.length-1;
            while(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        else{
        int pivot=findPivot(nums);
        int greater=Integer.MAX_VALUE;
        int greaterIndex = 0;
        int temp;
        for(int i=pivot+1;i<nums.length;i++)
        {
            if(nums[i]>nums[pivot])
            {
                temp=nums[i];
                if(temp<=greater)
                {
                    greater=temp;
                    greaterIndex=i;
                }
            }
        }
        swap(nums,pivot,greaterIndex);
        reverseSubarray(nums,pivot+1);}
        System.out.println(Arrays.toString(nums));
    }
    public static int findPivot(int[] nums) {
        int end=nums.length-1;
        for(int i=end-1;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
                return i;
        }
        return 0;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];;
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverseSubarray(int[] nums,int pivot){
        int start=pivot;int end=nums.length-1;
        while(start<=end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static boolean isDecreasing(int[] nums) {
        boolean decreasing=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                decreasing=false; break;
            }
        }
        return decreasing;
    }
}
