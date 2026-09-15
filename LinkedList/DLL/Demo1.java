// Deletion Operartion on DLL

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

public class Demo1 {

    // delete node 
    static void deleteNode(Node kNode) {
        Node prev = kNode.prev;
        Node next = kNode.next;

        if (next == null) {
            prev.next = null;
            kNode.prev = null;
            return;
        }

        prev.next = next;
        next.prev = prev;

        kNode.next = null;
        kNode.prev = null;

    }

    // delete Kth Node in DLL
    static Node deleteKthElement(Node head, int k) {
        if (head == null) { 
            return null;
        }

        Node kNode = head;
        int count = 0;
        
        while (kNode != null) {
            count++;
            if (count == k) {
                break;
            }
            kNode = kNode.next;
        }

        Node prev = kNode.prev;
        Node next = kNode.next;

        if (prev == null && next == null) {
            return null;
        }
        else if (prev == null) {
            return deleteHead(head);
        }
        else if (next == null) {
            return deleteTail(head);
        }

        prev.next = next;
        next.prev = prev;

        kNode.next = null;
        kNode.prev = null;

        return head;

    }

    // delete Tail of DLL
    static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node prev = temp.prev;
        prev.next = null;
        temp.prev = null;

        return head;
    }

    // delete head of DLL
    static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;

        head = head.next;
        prev.next = null; 
        head.prev = null;

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


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20, null, head);
        head.next.next = new Node(30, null, head.next);
        head.next.next.next = new Node(40, null, head.next.next);
        
        // int [] arr = {10,20,30,40};

        // Node head = convertToDLL(arr);
        // printDLL(head);

        // System.out.println();

        // Node newNode = deleteHead(head);
        // printDLL(newNode);
    
        // Node newNode = deleteTail(head);
        // printDLL(newNode);

        // Node newNode = deleteKthElement(head, 4);
        // printDLL(newNode);
    
        deleteHead(head.next);
        printDLL(head);
    }
}