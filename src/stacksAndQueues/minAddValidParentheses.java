//LeetCode: 921 Minimum add to make parentheses valid

package stacksAndQueues;
import java.util.*;

public class minAddValidParentheses {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack= new Stack<>();

        for(char ch: s.toCharArray())
        {
            if(ch=='(') stack.push(ch);
            else
            {
                if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
                else stack.push(ch);
            }
        }

        return stack.size();
    }

    static void main() {
        String s="(((";
        int add=minAddToMakeValid(s);
        System.out.println(add);
    }
}
