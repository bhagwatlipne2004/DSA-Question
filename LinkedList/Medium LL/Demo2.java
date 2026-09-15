import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

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

public class Demo2 {

    static Node sort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while(temp != null) {
            list.add(temp.data); 
            temp = temp.next;
        }
        Collections.sort(list);

        temp = head;

        for (Integer num : list) {
            temp.data = num;
            temp = temp.next;
        }

        return head;
    }

    // Check if the given Linked List is Palindrome
    static boolean palindrome(Node head) {
        // Node temp = head;

        // Stack<Integer> stack = new Stack<>();
        
        // while (temp != null) {
        //     stack.push(temp.data);
        //     temp = temp.next;
        // }

        // temp = head;

        // while (temp != null) {
        //     if (temp.data == stack.peek()) {
        //         temp = temp.next;
        //         stack.pop();
        //     }
        //     else {
        //         return false;
        //     }
        // }
        // return true;

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;

        while (second != null) {
            if (first.data != second.data) {
                reverse(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverse(newHead);
        return true;
    }

    // Delete the Middle Node of a Linked List
    static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;

        // Node temp = head;

        // int count = 0;

        // while (temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // temp = head;
        // int mid = count / 2 ;
        
        // while (temp != null) {
        //     mid--;
        //     if (mid == 0) {
        //         temp.next = temp.next.next;
        //         break;
        //     }
        //     temp = temp.next;
        // }
        // return head;
    }

    // Starting point of loop in a Linked List
    static Node startOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }

    // Detect a Cycle in a Linked List
    static boolean checkCycle(Node head) {
        // using Hashing

        // HashMap<Node , Integer> map = new HashMap<>();
        // Node temp = head;

        // while (temp != null) {
            
        //     if (map.containsKey(temp)) {
        //         return true;
        //     }
        //     map.put(temp, 1);
        //     temp = temp.next;
        // }
        
        // return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
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

    public static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;  // No change is needed; return the current head
        }

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
    public static void main(String[] args) {
    
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(5);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = null;
        
        
        // System.out.println(checkCycle(head));

        // Node newNode = startOfLoop(head);
        // if (newNode != null)
        //     System.out.println("Cycle starts at node with value: " + newNode.data);
        // else
        //     System.out.println("No cycle found.");

        // Node newNode = deleteMiddle(head);
        // printList(newNode);

        // System.out.println(palindrome(head));

        Node newNode = sort(head);
        printList(newNode);
    }
}
