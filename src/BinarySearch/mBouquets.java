package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class mBouquets {
    public static void main(String[] args) {
        int[] bloomDay={7,7,7,7,12,7,7};
        int reqDays=minDays(bloomDay,2,3);
        System.out.println(reqDays);
    }

    public static int minDays(int[] bloomDay, int m, int k)
    {
        if(bloomDay.length < m*k || bloomDay.length<=m || bloomDay.length<=k) return -1;

        int minDays=Integer.MAX_VALUE, maxDays=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            minDays=Math.min(minDays,bloomDay[i]);
            maxDays=Math.max(maxDays,bloomDay[i]);
        }

        while(minDays<maxDays)
        {
            int bouquets=0;
            int count=0;
            int mid=minDays+(maxDays-minDays)/2;
            int[] copy=Arrays.copyOf(bloomDay,bloomDay.length);
            for(int i=0;i<copy.length;i++)
            {
                copy[i]-=mid;
                if(copy[i]<=0) count++;
                else
                {
                    bouquets+=(count/k);
                    count=0;
                }
            }
            bouquets+=(count/k);
            if(bouquets<m) minDays=mid+1;
            else maxDays=mid;
        }
        return maxDays;
    }
}
