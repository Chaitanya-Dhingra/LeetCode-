package Array;

public class stocks {
    public static void main(String[] args) {
        int[] arr={2,4,1};
        int profit= maxProfit(arr);
        System.out.println(profit);
    }
    public static int maxProfit(int[] prices)
    {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else {
                int profit=prices[i]-minPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
