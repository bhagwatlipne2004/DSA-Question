// Insertion operation on DLL 

class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }    
    
}

public class Demo2 {

    // insert berfore head
    static Node insertBeforeHead(Node head, int data) {
        Node newNode = new Node(data, head, null);

        head.prev = newNode;
    
        return newNode;
    }

    // insert before tail
    static Node insertBeforeTail(Node head, int data) {

        if (head.next == null) {
            return insertBeforeHead(head, data);
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node prev = temp.prev;

        Node newNode = new Node(data);

        prev.next = newNode;
        newNode.prev = prev;

        newNode.next = temp;
        temp.prev = newNode;

        return head;
    }

    // convert Array to DLL
    static Node convertToDLL(int [] arr) {
        Node head = new Node(arr[0]);

        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, prev);
            prev.next = newNode;
            prev = newNode;
        }

        return head;
    } 

    // print DLL
    static void printDLL(Node head) {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
    

    static Node insertAtKth(Node head, int k, int data) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return insertBeforeHead(head, data);
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                if (temp.next == null) {
                    return insertBeforeTail(head, data);
                }
                if (temp.prev == null) {
                    return  insertBeforeHead(head, data);
                }
                Node prev = temp.prev;
                Node newNode = new Node(data, temp, prev);

                prev.next = newNode;
                temp.prev = newNode;

                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20, null, head);
        head.next.next = new Node(30, null, head.next);
        head.next.next.next = new Node(40, null, head.next.next);


        // Node newNode = insertBeforeHead(head, 30);
        // printDLL(newNode);

        // Node newNode = insertBeforeTail(head, 12);
        // printDLL(newNode);

        Node newNode = insertAtKth(head, 5, 45);
        printDLL(newNode);
    }
}
