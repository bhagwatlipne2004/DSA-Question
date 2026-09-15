// Operations on Singly LinkedList

class Node {

    int data;

    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    
}

public class Demo2 {

    // insert before value x
    static Node insertAtValue(Node head, int value, int data) {
        if (head == null) {
            return head;    
        }

        if (value == head.data) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == value) {
                Node newNode = new Node(data);
                newNode.next = temp;
                prev.next = newNode;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // insert at k th element
    static Node insertAtk(Node head, int data, int k) {
        if (head == null || k == 1) {
            return new Node(data, head);    
        }

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                break; 
            }
            temp = temp.next;
        }
        return head;
    }

    // insert after tail element
    static Node insertAtTail(Node head, int value) {
        if (head == null) {
            return new Node(value, head);    
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.next = new Node(value);

    }


    // insert before head position
    static Node insertHead(Node head, int value) {
        
        if (head == null) {
            return new Node(value, head);    
        }

        Node newNode = new Node(value, head);

        return newNode;
    }

    // print LL
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "    ");
            temp = temp.next;
        }
    }

     
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        // head = insertHead(head, 12);

        // Node n = insertAtTail(null, 12);
        // printLL(n);
        
        // head = insertAtk(head, 90, 0);
        // printLL(head);
    
        head = insertAtValue(head, 1, 0);
        printLL(head);
    }
    
}

