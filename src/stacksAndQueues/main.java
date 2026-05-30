package stacksAndQueues;

import java.util.Stack;

public class main {
    static void main(){
        queueUsingStackRemove q=new queueUsingStackRemove();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.empty());
    }
}
