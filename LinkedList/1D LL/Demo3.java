// Find the Length of a Linked List

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

public class Demo3 {
    
    static int length(Node head) {
        int cnt = 0;

        if (head == null) {
            return 0;
        }

        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        
        return cnt;
    }

    static boolean search(Node head, int value) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

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

        // System.out.println(length(null));
        // printLL(head);

        boolean present = search(head, 1);
        System.out.println(present);
  
    }
}
