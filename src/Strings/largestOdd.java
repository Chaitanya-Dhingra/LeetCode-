package Strings;

import java.util.*;

public class largestOdd {
    public static void main(String[] args) {
        String num="35427";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((int) num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
