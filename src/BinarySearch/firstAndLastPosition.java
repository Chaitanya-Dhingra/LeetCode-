package BinarySearch;

import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]= search(nums, target, true);
        if(ans[0]!=-1)
        {
            ans[1]= search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] arr, int target, boolean findfirst)
    {
        int ans=-1;
        if(arr.length==0) return ans;
        else
        {
            int start=0, end=arr.length-1;
            int mid;
            while(start<=end)
            {
                mid=start+(end-start)/2;
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    ans=mid;
                    if(findfirst)
                    {
                        end=mid-1;
                    }
                    else
                    {
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
}
