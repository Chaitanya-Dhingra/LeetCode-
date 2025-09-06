package Array;

public class rotatedSorted2 {
    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target =2;
        boolean found = search(arr, target);
        System.out.println(found);
    }

    public static boolean search(int[] nums, int target) {
        int pivot=findPivot(nums);
        boolean found=(ascBS(nums,pivot,nums.length-1,target) || ascBS(nums,0,pivot-1,target));
        return found;
    }
    public static int findPivot(int[] nums)
    {
        int start=0, end=nums.length-1;
        int mid=0;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else if(nums[mid]<nums[end])
            {
                end=mid;
            }
            else
            {
                end--;
            }
        }
        return end;
    }
    public static boolean ascBS(int[] arr, int start, int end, int target)
    {
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return false;
    }
//    public static boolean dscBS(int[] arr, int start, int end, int target)
//    {
//        int mid=0;
//        while(start<=end)
//        {
//            mid=start+(end-start)/2;
//            if(arr[mid]==target)
//            {
//                return true;
//            }
//            if(arr[mid]>target)
//            {
//                start=mid+1;
//            }
//            else
//            {
//                end=mid-1;
//            }
//        }
//        return false;
//    }
}
