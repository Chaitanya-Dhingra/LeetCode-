package Sorting;

public class maxProdOf3nos {
    public static void main(String[] args) {
        int[][] nums={{1,2,3,4},{-100,-98,-1,2,3,4}};
        for(int[] num: nums)
        {
            System.out.println(maximumProduct(num));
        }
    }

    public static int maximumProduct(int[] nums) {
        int first=nums[0];
        int second=nums[1];
        int third=nums[2];
        int prod=1;
        for(int i=3;i<nums.length;i++)
        {
            prod=first*second*third;
            if(nums[i]>first && nums[i]>second && nums[i]>third)
            {
                if(first<second && first<third && prod<nums[i]*second*third)
                {
                    first=nums[i];
                }
                else if(second<first && second<third && prod<nums[i]*first*third)
                {
                    second=nums[i];
                }
                else if(third<first && third<second && prod<nums[i]*first*second)
                {
                    third=nums[i];
                }
            }
        }
        return first*second*third;
    }
}
