package BinarySearch;

import java.util.*;
public class search2DMatrix2 {
    public static void main(String[] args) {
        int[][] arr={
                {-1,3}
        };
        int target=3;
        System.out.println(searchMatrix(arr,target));
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        ArrayList<Integer> rows=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=target){
                rows.add(i);
            }
        }
        boolean found=false;
        for(int col=0;col< arr[0].length;col++){
            int start=0, end=rows.size()-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[start][col]>target)
                {
                    found=false;
                    break;
                }
                if(arr[mid][col]==target)
                {
                    found=true; break;
                }
                else if(arr[mid][col]<target) start=mid+1;
                else end=mid-1;
            }
            if(found) break;
        }
        return found;
    }
}
