package BinarySearch;

public class findPeak {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int index=findPeakElement(arr);
        System.out.println(index);
    }
    public static int findPeakElement(int[] arr)
    {
        int start=0, end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }
}
