package Strings;

public class Stringrotate {
    public static void main(String[] args) {
        String s="abcde";
        String goal="abced";
        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m) return false;
        if(s.equals(goal)) return true;
        for(int i=0;i<n-1;i++)
        {
            String temp=s.substring(i+1,n)+s.substring(0,i+1);
            if(temp.equals(goal)) return true;
        }
        return false;
    }
}
