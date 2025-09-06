package Array;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int dup = duplicate(arr);
        System.out.println(dup);
    }

    public static int duplicate(int[] nums) {
        int n=nums.length;
        int[] frequency= new int[n+1];
        for(int i=0;i<n;i++)
        {
            frequency[nums[i]]++;
            if(frequency[nums[i]]>1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}

