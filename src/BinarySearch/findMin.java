package BinarySearch;

public class findMin {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int mini=findMin(arr);
        System.out.println(mini);
    }

    public static int findMin(int[] arr) {
        int start=0, end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return arr[end];
    }
}
