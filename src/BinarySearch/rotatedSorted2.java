package BinarySearch;

public class rotatedSorted2 {
    public static void main(String[] args) {
        int[] arr={2,5,6,0,0,1,2};
        int target=0;
        boolean found=search(arr,target);
        System.out.println(found);
    }
    public static boolean search(int[] arr, int target) {
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target) return true;

            else if(arr[start]==arr[mid] && arr[mid]==arr[end])
            {
                start++; end--;
            }

            else if(arr[mid]>=arr[start])
            {
                if(target>=arr[start] && target<arr[mid])
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
        return false;
    }
}
