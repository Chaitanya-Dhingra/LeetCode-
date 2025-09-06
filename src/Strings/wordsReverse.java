package Strings;

import java.util.Arrays;

public class wordsReverse {
    public static void main(String[] args) {
        String str="a good   example";
        String ans=reverseWords(str);
        System.out.println(ans);
    }

    public static String reverseWords(String up)
    {
        up=up.trim();
        String[] words=up.split(" ");
        String p="";
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].equals("")) continue;
            p+=words[i]+" ";
        }
        return p.trim();
    }
}
