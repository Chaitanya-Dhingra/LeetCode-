//Hackerrank: Game of two stakcs

package stacksAndQueues;

import java.util.*;

public class gameOfTwoStacks {
    static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int maxSum= sc.nextInt();
            int count=0;
            int[] a=new int[n];
            int[] b=new int[m];

            for(int i=0; i<n; i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int sum=0; int i=0;

            while(i<n && sum+a[i]<=maxSum) {
                sum+=a[i++];
            }
                count=i;int j=0;
            while(true)
            {
                while(j<m && sum+b[j]<=maxSum)
                {
                    sum+=b[j++];
                }
                count=Math.max(count,i+j);

                if(i==0) break;

                sum-=a[i-1];
                i--;
            }
            System.out.println(count);
        }
    }
}
