package Recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[][] strings={
                {'h','e','l','l','o'},
                {'H','a','n','n','a','h'}
        };
        for(char[] string: strings)
        {
            reverseString(string);
            System.out.println(Arrays.toString(string));
        }
    }

    public static void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    public static void reverse(char[] s, int start, int end) {
        if(start >= end)
        {
            return;
        }
        swap(s,start,end);
        reverse(s,start+1,end-1);
    }

    public static void swap(char[] s, int start, int end) {
        char temp= s[start];
        s[start]=s[end];
        s[end]=temp;
    }
}
