package Recursion;

public class NoOfSteps {
    public static void main(String[] args) {
        int n=41;
        int steps=countsteps(n);
        System.out.println(steps);
    }
    public static int countsteps(int n) {
        return helper(n,0);
    }
    public static int helper(int n, int steps) {
        if(n==0)
        {
            return steps;
        }
        if(n%2==0)
        {
            return helper(n/2,steps+=1);
        }
        return helper(n-1,steps+=1);
    }
}
