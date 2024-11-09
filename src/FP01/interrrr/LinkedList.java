package src.FP01.interrrr;

class LinkedList {
    Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end
    public void insert(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the list is empty, make the new node as head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new node at the end
            last.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete a node by key
    public void delete(int key) {
        Node temp = head, prev = null;

        // If the head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in the list
        if (temp == null) return;

        // Unlink the node from the linked list
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        // Start with the empty list
        LinkedList list = new LinkedList();

        // Insert some nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Display the list
        System.out.println("Created Linked list:");
        list.display();

        // Delete a node
        list.delete(2);
        System.out.println("Linked list after deleting node with data 2:");
        list.display();
    }
}
