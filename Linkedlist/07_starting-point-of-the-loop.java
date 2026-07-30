//brute force
class Solution {
    // Function to detect start of loop using Hash Map
    public ListNode detectCycle(ListNode head) {
        // Create a set to store visited nodes
        Set<ListNode> visited = new HashSet<>();

        // Traverse through the list
        while (head != null) {
            // If already visited, it's the start of the loop
            if (visited.contains(head)) {
                return head;
            }

            // Mark current node as visited
            visited.add(head);

            // Move to the next node
            head = head.next;
        }

        // No cycle found
        return null;
    }


//optimal sol
class Solution {
    // Function to detect the starting point of loop using Floyd’s algorithm
    public ListNode detectCycle(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Traverse while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // If they meet, cycle is present
            if (slow == fast) {
                // Reset slow to head
                slow = head;

                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the starting node of loop
                return slow;
            }
        }

        // If no cycle found
        return null;
    }
}
