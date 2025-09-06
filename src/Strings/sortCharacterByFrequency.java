package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class sortCharacterByFrequency {
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));
        String res = "";
        for (char ch : chars) {
            res += String.valueOf(ch).repeat(map.get(ch));
        }
        return res;
    }
}
