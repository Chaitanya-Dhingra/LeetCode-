package Array;

public class power {
    public static void main(String[] args) {
        double ans=myPow(2,10);
        System.out.println(ans);
    }
    public static double myPow(double x, int n) {
        long p=n;
        if(p<0) p=-1*p;
        double ans=1.0;
        while(p>0)
        {
            if(p%2==0)
            {
                x*=x;
                p=p/2;
            }
            else {
                ans*=x;
                p=p-1;
            }
        }
        if(p<0) return 1.0/ans;
        return ans;
    }
}
