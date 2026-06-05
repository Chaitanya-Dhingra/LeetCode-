//LeetCode- 84: Largest Rectangle in Histogram

package stacksAndQueues;
import java.util.*;
public class largestHistogram   {
    public static int largestRectangleArea(int[] heights)
    {
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        int max=0;
        for(int i=1; i< heights.length; i++)
        {
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                max=getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i=heights.length;
        while(!stack.isEmpty())
        {
            max=getMax(heights, stack, max, i);
        }
        return max;
    }

    public static int getMax(int[] arr, Stack<Integer> stack, int max, int i)
    {
        int area;
        int popped=stack.pop();
        if(stack.isEmpty())
        {
            area=arr[popped]*i;
        }
        else
        {
            area=arr[popped]*(i-1-stack.peek());
        }
        return Math.max(area,max);
    }

    static void main() {
        int[] heights={2,1,5,6,2,3};
        int largest=largestRectangleArea(heights);
        System.out.println(largest);
    }
}
