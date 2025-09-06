package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        int index=search(arr,target);
        System.out.println(index);
    }
    public static int search(int[] arr,int target){
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
