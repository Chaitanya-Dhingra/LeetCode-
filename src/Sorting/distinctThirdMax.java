package Sorting;

import java.util.Arrays;

public class distinctThirdMax {
    public static void main(String[] args) {
        int[][] nums={
                {3,2,1},
                {1,2},
                {2,2,3,1},
                {5,2,4,1,3,6,0}
        };
        for(int[] num: nums)
        {
            System.out.println(thirdMax(num));
        }
    }

        public static int thirdMax(int[] nums) {
            long first= Long.MIN_VALUE, second= Long.MIN_VALUE, third= Long.MIN_VALUE;
            for(int num: nums)
            {
                if(num==first || num==second || num==third) continue;
                else if(num> first)
                {
                    third= second;
                    second= first;
                    first= num;
                }
                else if(num>second && num<first)
                {
                    third= second;
                    second= num;
                }
                else if(num>third && num<second)
                {
                    third= num;
                }
            }

            if(third==Long.MIN_VALUE) return (int)first;
            return (int)third;
        }
}
