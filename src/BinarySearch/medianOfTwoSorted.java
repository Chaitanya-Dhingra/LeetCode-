package BinarySearch;

public class medianOfTwoSorted {
    public static void main(String[] args) {
        int[] arr={1,3};
        int[] num={2};
        System.out.println(findMedianSortedArrays(arr,num));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged= merge(nums1,nums2);
        int mergedLen=merged.length;
        if(mergedLen%2==0){
            return (merged[(mergedLen-1)/2]+merged[((mergedLen-1)/2)+1])/2.0;
        }
        return merged[mergedLen/2];
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k]=nums1[i++];
            }
            else {
                merged[k]=nums2[j++];
            }
            k++;
        }
        while(i<nums1.length){
            merged[k++]=nums1[i++];
        }
        while(j<nums2.length){
            merged[k++]=nums2[j++];
        }
        return merged;
    }
}
