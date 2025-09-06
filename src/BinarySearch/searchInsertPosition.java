package BinarySearch;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=4;
        int index=searchInsert(arr,target);
        System.out.println(index);
    }
    public static int searchInsert(int[] arr, int target)
    {
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }

            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
