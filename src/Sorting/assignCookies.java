package Sorting;

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] g={2,3};
        int[] s={1};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int i=0, j=0;
        int count=0;
        while(i<g.length && j<s.length) {
            if(g[i]<=s[j]) {
                count++;
                i++; j++;
            }
            else
            {
                j++;
            }
        }
        return count;
    }
}
