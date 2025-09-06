package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfArrays1 {
    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }


//    TC- O(M*N)
//    public static int[] intersection(int[] num1, int[] num2)
//    {
//        Arrays.sort(num1); Arrays.sort(num2);
//        ArrayList<Integer> intersected = new ArrayList<Integer>();
//        for(int i=0;i< num1.length;i++)
//        {
//            if(i>=1 && num1[i]==num1[i-1]) continue;
//            for(int j=0;j<num2.length;j++)
//            {
//                if(j>=1 && num2[j]==num2[j-1]) continue;
//
//                if(num1[i]<num2[j]) break;
//
//                if(num1[i]==num2[j]) intersected.add(num1[i]);
//            }
//        }
//        int[] intersectedArray = new int[intersected.size()];
//        for(int i=0;i<intersected.size();i++)
//        {
//            intersectedArray[i] = intersected.get(i);
//        }
//        return intersectedArray;
//    }
    // Two Pointer approach

    public static int[] intersection(int[] num1, int[] num2)
    {
        Arrays.sort(num1); Arrays.sort(num2);
        int i=0, j=0;
        ArrayList<Integer> intersected=new ArrayList<>();
        while(i<num1.length && j<num2.length)
        {
            if(i>0 && num1[i]==num1[i-1])
            {
                i++; continue;
            }

            if(num1[i]<num2[j])
            {
                i++;
            }
            else if (num1[i]>num2[j])
            {
                j++;
            }
            else
            {
                intersected.add(num1[i]);
                i++; j++;
            }
        }
        int[] result=new int[intersected.size()];
        for(i=0;i<intersected.size();i++)
        {
            result[i]=intersected.get(i);
        }
        return result;
    }
}
