package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfArrays2 {
    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[] num2={2,2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    public static int[] intersection(int[] num1, int[] num2)
    {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i=0, j=0;
        ArrayList<Integer> intersected=new ArrayList<>();
        while(i<num1.length && j<num2.length){
            if(num1[i]<num2[j]){
                i++;
            }
            else if(num1[i]>num2[j]){
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
