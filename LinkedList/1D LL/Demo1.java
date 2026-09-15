// Introduction to Singly LinkedList


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

public class Demo1 {

    // delete Value in LL
    static Node deleteValue(Node head, int value) {
        if (head == null) {

            return null;
        }

        if (head.data == value) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == value) {
                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // delete k th element in LL
    static Node deleteK(Node head, int k) {
        if (head == null) {

            return null;
        }

        if (k == 1) {
            head = head.next;

            return head;
        }

        Node temp = head;
        Node prev = null;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    // delete tail node
    static Node deleteTail(Node head) {
        if (head == null
            || head.next == null) {

            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    // delete head node
    static Node deleteHead(Node head) {
        head = head.next;
        
        return head;
    }

    // convert Array into LL
    static Node convertArrayToLL(int [] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }


    // print LL
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "    ");
            temp = temp.next;
        }
    }

    // insert At head position
    static Node insertAtHead(Node head, int data) {
        Node newData = new Node(data, head);

        return newData;
    }

    public static void main(String[] args) {

        int [] arr = {12, 14, 65, 64};
        Node LL = convertArrayToLL(arr); 
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // printLL(LL);

        
        // printLL(head);
        // System.out.println();
        // Node newHead = insertAtHead(head, 10);

        // printLL(newHead);

        // Node dNode =  deleteHead(head);
        // printLL(dNode);   
        // deleteHead(head);
        // printLL(head);
        
        // deleteTail(head);
        // printLL(head);

        // Node n =  deleteK(head, 0);
        // printLL(n);

        Node dVNode = deleteValue(head, 45);
        printLL(dVNode);
    }
    
}