//LeetCode- 1541: Minimum Insertions to balance a parentheses string

package stacksAndQueues;

import java.util.*;

public class minInsertionsToBalanceParentheses {
    public static int minInsertions(String s)
    {
        int ins=0, open=0;
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open++; i++;
            }
            else
            {
                if(i+1<s.length() && s.charAt(i+1)==')')
                {
                    i+=2;
                }
                else
                {
                    i++; ins++;
                }
                if(open>0) open--;
                else ins++;
            }
        }
        return (open*2)+ins;
    }

    static void main() {
        String s="(()))";
        int insertions= minInsertions(s);

        System.out.println(insertions);
    }
}
