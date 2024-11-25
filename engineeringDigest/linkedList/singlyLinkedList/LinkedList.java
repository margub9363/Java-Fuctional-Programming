class LinkedList {
    // Node class to represent each element in the list
    static class Node {
        int data;      // Value of the node
        Node next;     // Reference to the next node

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Remove a node by value
    public boolean remove(int data) {
        if (head == null) { // If the list is empty
            System.out.println("List is empty.");
            return false;
        }

        if (head.data == data) { // If the head is to be removed
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next; // Traverse to find the node to be removed
        }

        if (current.next == null) { // If the node wasn't found
            System.out.println("Element not found.");
            return false;
        }

        current.next = current.next.next; // Remove the node
        return true;
    }

    // Display the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Linked List after adding elements:");
        list.display();

        // Removing an element
        list.remove(20);
        System.out.println("Linked List after removing 20:");
        list.display();

        // Trying to remove an element not in the list
        list.remove(40);

        // Adding another element
        list.add(40);
        System.out.println("Linked List after adding 40:");
        list.display();
    }
}
