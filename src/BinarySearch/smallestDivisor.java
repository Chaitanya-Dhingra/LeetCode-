package BinarySearch;

public class smallestDivisor {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int target=5;
        System.out.println(smallestDiv(arr,target));
    }

    public static int smallestDiv(int[] nums, int threshold)
    {
        int min=1, max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        while(min<max)
        {
            int mid=min+(max-min)/2;
            int sum=findSum(nums, mid);

            if(sum>threshold)
            {
                min=mid+1;
            }
            else {
                max=mid;
            }
        }
        return min;
    }

    public static int findSum(int[] arr, int div)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=Math.ceilDiv(arr[i],div);
        }
        return sum;
    }
}
