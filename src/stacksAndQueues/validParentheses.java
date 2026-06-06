//LeetCode: 20 Valid Parentheses

package stacksAndQueues;
import java.util.*;

public class validParentheses {
    public static boolean isValid(String s)
    {
        Stack<Character> stack= new Stack<>();

        for(char c: s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            else
            {
                if(stack.isEmpty()) return false;
                else
                {
                    if((c==')' && stack.peek()=='(')
                            || (c=='}' && stack.peek()=='{')
                            || (c==']' && stack.peek()=='['))
                        stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty()?true:false;
    }

    static void main() {
        String s="([)]";
        boolean valid=isValid(s);
        if(valid) System.out.println(true);
        else System.out.println(false);
    }
}
