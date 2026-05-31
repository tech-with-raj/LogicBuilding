package main.java.dsa;

/*
 * Problem Name: Node Representation for a Singly Linked List
 *
 * Problem Statement:
 * Create a Node class that represents a single node in a Singly Linked List.
 *
 * Each node should contain:
 * 1. A data field to store the value.
 * 2. A reference to the next node in the list.
 *
 * This Node class serves as the fundamental building block for implementing
 * linked list operations such as:
 * - Traversal
 * - Insertion
 * - Deletion
 * - Searching
 * - Reversal
 *
 * Example:
 *
 * Input:
 * Node firstNode = new Node(10);
 * Node secondNode = new Node(20);
 *
 * firstNode.next = secondNode;
 *
 * Linked List:
 * 10 -> 20 -> null
 *
 * Output:
 * Node objects successfully created and linked.
 *
 * Explanation:
 * Each node stores:
 * - Its own data value.
 * - A reference to the next node.
 *
 * The last node points to null, indicating the end of the linked list.
 *
 * Approach:
 * 1. Define a Node class.
 * 2. Create an integer field to store node data.
 * 3. Create a Node reference to store the next node.
 * 4. Initialize data through the constructor.
 * 5. Set the next reference to null initially.
 * 6. Provide a getter method to access node data.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Where:
 * This class represents a single linked list node and does not
 * perform any traversal or processing operations.
 */

public class Node {

    int data;
    Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;
    }

    public int getData() {

        return data;
    }
}