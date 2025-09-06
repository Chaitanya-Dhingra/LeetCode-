package Strings;

public class longestPrefix {
    public static void main(String[] args) {
        String[] str={"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] str) {
        String res="";
        int minLength=Integer.MAX_VALUE;
        String minString="";
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()<minLength)
            {
                minString=str[i]; minLength=str[i].length();
            }
        }
        if(minLength==0) return res;
        for(int i=0;i<minLength;i++)
        {
            boolean flag=true;
            for(int j=0;j<str.length;j++)
            {
                if(minString.charAt(i)!=str[j].charAt(i))
                {
                    flag=false;
                    break;
                }
            }
            if(!flag) break;
            res+=minString.charAt(i);
        }
        return res;
    }
}
