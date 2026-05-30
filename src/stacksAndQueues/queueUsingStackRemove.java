//LeetCode 232: Implement Queue using Stacks(Remove efficient approach)
package stacksAndQueues;

import java.util.Stack;

public class queueUsingStackRemove {
    private  Stack<Integer> first;
    private  Stack<Integer> second;

    public queueUsingStackRemove(){
        first= new Stack<>();
        second= new Stack<>();
    }

    public void push(int item){
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        first.push(item);
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
    }

    public int pop(){
        return second.pop();
    }

    public int peek(){
        return second.peek();
    }

    public boolean empty(){
        return second.isEmpty();
    }
}
