package BinarySearch;

import java.util.ArrayList;

public class kthMissing {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missing=new ArrayList<>();
        int i=1, j=0;
        while(missing.size()<k){
            if(i!=arr[j])
            {
                missing.add(i);
            }
            else if(j<arr.length-1) j++;
            i++;
        }
        return missing.get(k-1);
    }
}
