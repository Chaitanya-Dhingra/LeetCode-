package Array;

public class uniqueP {
    public static void main(String[] args) {
        int countPaths = uniquePaths(51,9);
        System.out.println(countPaths);
    }

    public static int uniquePaths(int r, int c)
    {
        int count=0;
        if(r==1 || c==1)
        {
            return 1;
        }
        count+=uniquePaths(r-1,c)+uniquePaths(r,c-1);
        return count;
    }
}
