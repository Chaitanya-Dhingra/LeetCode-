package BinarySearch;

public class rotatedSorted1 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=2;
        int index=search(arr, target);
        System.out.println(index);
    }
    public static int search(int[] arr, int target) {
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target) return mid;

            else if(arr[mid]>arr[start])
            {
                if(arr[start]<=target && target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

            else
            {
                if(target>arr[mid] && target<=arr[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
