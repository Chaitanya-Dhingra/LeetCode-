package Strings;

public class maxNestingDepth {
    public static void main(String[] args) {
//        "(1+(2*3)+((8)/4))+1","(1)+((2))+(((3)))","()(())((()()))"
        String[] str={"(1+(2*3)+((8)/4))+1","(1)+((2))+(((3)))","()(())((()()))"};
        for(String s: str)
        {
            System.out.println(maxDepth(s));
        }
    }

    public static int maxDepth(String s)
    {
        int counter=0;
        int depthMax=Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                counter++;
            }
            else if(s.charAt(i)==')')
            {
                depthMax=Math.max(depthMax,counter);
                counter--;
            }
        }
        if (depthMax==Integer.MIN_VALUE) return 0;
        return depthMax;
    }
}
