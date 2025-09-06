package BinarySearch;

import java.util.Arrays;

public class kokoBananas {
    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int h=8 ;
        int k=minEatingSpeed(arr,h);
        System.out.println(k);
    }

    public static int findMax(int[] arr)
    {
        int maxi=Integer.MIN_VALUE;
        for(int num: arr)
        {
            maxi=Math.max(maxi,num);
        }
        return maxi;
    }

    public static boolean isPossible(int[] arr, int k, int h)
    {
        int hours = 0;
        for (int pile : arr) {
            hours += (pile + k - 1) / k;
            if(hours > h) return false;
        }
        return hours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start=1, end=findMax(piles);
        int mid=0;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(isPossible(Arrays.copyOfRange(piles,0,piles.length),mid,h))
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
