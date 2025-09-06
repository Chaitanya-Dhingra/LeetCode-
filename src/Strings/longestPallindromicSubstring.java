package Strings;

public class longestPallindromicSubstring {
    public static void main(String[] args) {
        String[] str={"babad", "cbbd", "ac"};
        for(String s: str)
        {
            System.out.println(longestPallindrome(s));
        }
    }

    public static String longestPallindrome(String s) {
        int start=0, end=s.length()-1;
        String res="";
        boolean found=false;
        while(!found)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                if(isPallindrome(s.substring(start,end+1))){
                    found=true;
                    res=s.substring(start,end+1);}
                else
                {
                    if(s.charAt(start)==s.charAt(end-1)) end--;
                    if(s.charAt(start+1)==s.charAt(end)) start++;
                    else
                    {
                        start++; end--;
                    }
                }
            }
            if(s.charAt(start)==s.charAt(end-1)) end--;
            if(s.charAt(start+1)==s.charAt(end)) start++;
            else
            {
                start++; end--;
            }
        }
        return res;
    }

    public static boolean isPallindrome(String s) {
        int start=0, end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

}
