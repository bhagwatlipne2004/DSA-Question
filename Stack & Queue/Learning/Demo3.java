package Learning;

// Implement Stack using Array

class StackImpl {
    
    int [] st;

    int capacity;

    int top;
        
    public StackImpl(int capacity) {
        this.capacity = capacity;
        st = new int[capacity];
        // initalize empty stack
        this.top = -1;
    }

    public StackImpl() {
        this(1000);
    }

    // push element x
    public void push (int element) {
        if (top >= capacity - 1) {
            System.out.println("Stack overflow");   
            return ;
        }
        top = top + 1;
        st[top] = element;
    }

    //  removes and return top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("No element to pop");
            return -1;
        }

        return st[top--];
    }

    // Return top element
    public int top() {
        if (isEmpty()) {
            System.out.println("No element present");
            return -1;
        }

        return st[top];
    }

    /* Returns true if the 
       stack is empty, false otherwise */
    public boolean isEmpty() {
        return top == -1;
    }
}

public class Demo3 {

    public static void main(String[] args) {
        
        StackImpl st = new StackImpl();
        st.push(1);
        System.out.println(st.pop());
        st.push(2);
        // st.push(2);
        // st.push(3);
        System.out.println(st.top());
        
    }
}
