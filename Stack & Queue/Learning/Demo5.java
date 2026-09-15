package Learning;

import java.util.LinkedList;
import java.util.Queue;

class StackImpl {

    // Queue
    Queue<Integer> q = new LinkedList<>();

    // Method to push element in the stack
    public void push(int x) {
        //get size
        int s = q.size();
        // add element
        q.add(x);

        // Move elements before new element to back
        for (int i = 0; i < s; i++) {
            q.add(q.poll());
        }
    }    

    public int pop() {
        int n = q.peek();
        q.poll();
        return n;
    }

    public int top() {
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}

public class Demo5 {
    
    public static void main(String[] args) {
        
        QueueImpl q = new QueueImpl();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);


        System.out.println(q.peek());
    }
}
