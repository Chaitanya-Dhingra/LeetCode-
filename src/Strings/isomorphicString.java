package Strings;

import java.util.*;
public class isomorphicString {
    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (mapST.containsKey(sc) && mapST.get(sc) != tc) {
                return false;
            }
            if (mapTS.containsKey(tc) && mapTS.get(tc) != sc) {
                return false;
            }
            mapST.put(sc, tc);
            mapTS.put(tc, sc);
        }
        return true;
    }
}
