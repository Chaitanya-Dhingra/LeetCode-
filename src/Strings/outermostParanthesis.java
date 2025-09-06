package Strings;

public class outermostParanthesis {
    public static void main(String[] args) {
        String up="()()";
        String p=removeOuterParanthesis(up);
        System.out.println(p);
    }

    public static String removeOuterParanthesis(String s) {
        String p=helper("",s,0);
        return p;
    }

    public static String helper(String p, String up, int count)
    {
        if(up.isEmpty())
        {
            return p;
        }
        if(count==0 && up.charAt(0)=='(') return helper(p,up.substring(1),count+1);
        if(count==1 && up.charAt(0)==')') return helper(p,up.substring(1), 0);
        if(up.charAt(0)=='(') return helper(p+up.charAt(0),up.substring(1),count+1);
        if(up.charAt(0)==')') return helper(p+up.charAt(0),up.substring(1),count-1);
        return p;
    }
}
