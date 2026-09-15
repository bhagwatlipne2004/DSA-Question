

class Node {

    int data;

    Node next;

    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
    }

    Node() {

    }
}

public class Demo1 {

    // Find middle element in a Linked List
    static Node middleNode(Node head) { 

        if (head == null || head.next == null) {
            return head;
        }

        // Node temp = head;
        // int cnt = 0;

        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }

        // temp = head;
        // int mid = cnt / 2 + 1;

        // while (temp != null) {
        //     mid = mid - 1;
        //     if (mid == 0) {
        //         break;
        //     }
        //     temp = temp.next;
        // }

        // return temp;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reverse a Linked List
    public static Node reverse(Node head) {

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;

    }

    // Remove N-th node from the end of a Linked List
    static Node removeNthNode(Node head, int N) {

        Node dummy = new Node(0, head);
        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    } 

    // Sort a Linked List of 0's 1's and 2's by changing links
    static Node sort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while (temp != null) {
            
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } 
            else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }


        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        zeroHead = zeroHead.next;

        return zeroHead;
    }  

    // Segregate even and odd nodes in LinkedList
    static Node segregateOddEven(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        Node odd = head;
        Node even = head.next;
        Node evenhead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenhead;

        return temp;

    }

    // Add two numbers represented as Linked Lists
    static Node addTwoLL(Node l1, Node l2) {

        Node dummy = new Node();
        Node temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = (sum / 10);

            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }

        return dummy.next;
    }

    static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // int[] num1 = {2, 4, 3}; // represents 342
        // int[] num2 = {5, 6, 4}; // represents 465
        // Node l1 = createList(num1);
        // Node l2 = createList(num2);

        // Node newNode = addTwoLL(l1, l2);
        // printList(newNode);

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Node newNode = segregateOddEven(head);
        // printList(newNode);

        // Node newNode = sort(head);
        // printList(newNode);

        // Node newNode = removeNthNode(head, 5);
        // printList(newNode);

        // Node newNode = reverse(head);
        // printList(newNode);

        // Node newNode = middleNode(head);
        // System.out.println(newNode.data);        

    }
}