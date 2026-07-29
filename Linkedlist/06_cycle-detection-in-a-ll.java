//brute force

class Solution {
    // function to detect loop in linked list
    public boolean detectLoop(Node head) {
        // Initialize a pointer 'temp'
        // at the head of the linked list
        Node temp = head;

        // Create a map to keep track of
        // encountered nodes
        HashMap<Node, Integer> nodeMap = new HashMap<>();

        // Step 2: Traverse the linked list
        while (temp != null) {
            // If the node is already in the
            // map, there is a loop
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            // Store the current node
            // in the map
            nodeMap.put(temp, 1);

            // Move to the next node
            temp = temp.next;
        }

        // Step 3: If the list is successfully traversed 
        // without a loop, return false
        return false;
    }
}

//optimal
class Solution {
    // Function to detect a loop in a linked
    // list using the Tortoise and Hare Algorithm
    public boolean hasCycle(ListNode head) {
        // Initialize two pointers, slow and fast,
        // to the head of the linked list
        ListNode slow = head;
        ListNode fast = head;

        // Step 2: Traverse the linked list with
        // the slow and fast pointers
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true;  // Loop detected
            }
        }

        // If fast reaches the end of the list,
        // there is no loop
        return false;
    }
