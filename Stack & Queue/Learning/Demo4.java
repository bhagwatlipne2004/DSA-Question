package Learning;

// Queue using Arrays 

class QueueImpl {

    int start;
    int end;

    int [] arr;
    int currSize, maxSize;

    public QueueImpl() {
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 4;

        arr = new int[maxSize];
    }

    
    // Method to push an element into the queue
    public void push(int element) {
        if (currSize == maxSize) {
            System.out.println("Queue is full");
            return ;
        }

        // If the queue is empty, initialize start and end
        if (end == -1) {
            start = 0;
            end = 0;
        } 
        else {
            // circular increament of end
            end = (end + 1) % maxSize;
        }

        arr[end] = element;
        currSize++;
    }

    // Method to pop an element from the queue
    public int pop() {
        if (start == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int popped = arr[start];

        // if queue have only one element
        if (currSize == 1) {
            start = -1;
            end = -1;    
        }
        else {
            start = (start + 1) % maxSize;
        }

        currSize--;
        return popped;
    }

    // method to get the front of the queue
    public int peek() {
        // check if the queue is empty
        if (start == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }   

    // Method to determine whether the queue is empty
    public boolean isEmpty() {
        return (currSize == 0);
    }
    
}

public class Demo4 {

    public static void main(String[] args) {
     
        QueueImpl q = new QueueImpl();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(20);
        q.pop();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
