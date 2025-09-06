package Strings;

import java.util.Arrays;

public class anagramString {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t)
    {
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
