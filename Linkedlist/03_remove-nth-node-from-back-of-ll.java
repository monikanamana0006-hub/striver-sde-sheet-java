//brute force

import java.util.*;

// Class representing a node in the linked list
class Node {
    int data;
    Node next;

    // Constructor for Node with data and next node
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next = null)
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Class to hold the solution logic
class Solution {

    // Function to print the linked list
    public void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth node from the end
    public Node deleteNthNodeFromEnd(Node head, int N) {
        // If list is empty
        if (head == null) {
            return null;
        }

        int cnt = 0;
        Node temp = head;

        // Count total number of nodes
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // If N equals total nodes → delete head
        if (cnt == N) {
            return head.next;
        }

        // Calculate position from start
        int res = cnt - N;
        temp = head;

        // Traverse to the node before target
        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        // Delete the node
        temp.next = temp.next.next;

        return head;
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 3;

        // Create linked list manually
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        // Create Solution object
        Solution sol = new Solution();

        // Delete the Nth node from the end
        head = sol.deleteNthNodeFromEnd(head, N);

        // Print the modified linked list
        sol.printLL(head);
    }
}
