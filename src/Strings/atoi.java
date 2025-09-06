package Strings;

public class atoi {
    public static void main(String[] args) {
//        "42"," -042", "1337c0d3","words and 987","0-1","-91283472332", "+-12"
        String[] str={"42"," -042", "1337c0d3","words and 987","0-1","-91283472332", "+-12","3.14"};
        for(String s: str)
        {
            System.out.println(myAtoi(s));
        }
    }

    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign * num);
    }
}
