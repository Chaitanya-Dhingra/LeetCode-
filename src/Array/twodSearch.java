package Array;

public class twodSearch {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=17;
        boolean found=searchMatrix(arr,target);
        System.out.println(found);
    }
    public static boolean searchMatrix(int[][] arr, int target) {
        int start=0, end=arr.length-1;
        int n=arr[0].length-1;
        int mid=0;
        int row=-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if((arr[mid][0]<=target) && (arr[mid][n]>=target))
            {
                row=mid; break;
            }
            if(arr[mid][0]>target)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        if(row==-1)
        {
            return false;
        }
        start=0; end=n;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[row][mid]==target)
            {
                return true;
            }
            if(arr[row][mid]>target)
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
}
