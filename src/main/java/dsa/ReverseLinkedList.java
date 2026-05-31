package main.java.dsa;

/*
 * Problem Name: Reverse a Singly Linked List
 *
 * Problem Statement:
 * Given the head node of a singly linked list, reverse the linked list
 * and print both the original and reversed versions.
 *
 * A singly linked list consists of nodes where each node contains:
 * - Data
 * - Reference to the next node
 *
 * Example:
 *
 * Input:
 * 10 -> 20 -> 30 -> 40 -> null
 *
 * Output:
 * Original Linked List:
 * 10 20 30 40
 *
 * Reversed Linked List:
 * 40 30 20 10
 *
 * Explanation:
 * Initially:
 *
 * 10 -> 20 -> 30 -> 40 -> null
 *
 * After reversing:
 *
 * 40 -> 30 -> 20 -> 10 -> null
 *
 * The links between nodes are reversed one by one using three pointers:
 * - previous
 * - current
 * - next
 *
 * Approach:
 * 1. Create a linked list.
 * 2. Traverse and print the original linked list.
 * 3. Initialize:
 *    - previous = null
 *    - current = head
 * 4. Iterate through the list.
 * 5. Store the next node.
 * 6. Reverse the current node's link.
 * 7. Move previous and current one step forward.
 * 8. Continue until current becomes null.
 * 9. previous becomes the new head of the reversed list.
 * 10. Traverse and print the reversed linked list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of nodes in the linked list.
 */

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        traverseLinkedList(head);

        System.out.println("\nReversed Linked List:");
        traverseLinkedList(reverseLinkedList(head));
    }

    public static void traverseLinkedList(Node head) {

        Node currentNode = head;

        while (currentNode != null) {

            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public static Node reverseLinkedList(Node head) {

        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;

        while (currentNode != null) {

            nextNode = currentNode.next;

            currentNode.next = previousNode;

            previousNode = currentNode;

            currentNode = nextNode;
        }

        return previousNode;
    }
}