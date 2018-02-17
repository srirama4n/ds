package com.ds.sll;

import java.util.HashSet;

public class SingleLinkedList {

    Node head;
    Node tail;
    int size;

    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.println("Node data :  " + node.data);
            node = node.next;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        ++size;
    }

    /**
     * Remove Dups: Write code to remove duplicates from an unsorted linked list.
     */
    public void removeDuplicatedUsingHashSet() {
        HashSet set = new HashSet();
        Node node = head;
        Node previous = null;
        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    public void removeDuplicatedWithoutBuffer() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public int kthFromLastUsingSize(int k) {
        int iterations = size - k;
        Node node = head;
        while (iterations > 0) {
            node = node.next;
            --iterations;
        }
        return node.data;
    }

    public int kthFromLastUsingRecursion(Node node, int k) {
        Node actualNode = kthLast(node, k, new Idx());
        return actualNode.data;
    }

    private Node kthLast(Node node, int k, Idx index) {
        if (node == null) {
            return null;
        }

        Node runner = kthLast(node.next, k, index);
        index.value = index.value + 1;
        if (index.value == k) {
            return node;
        }
        return runner;
    }


    public int kthFromLastUsingIterative(int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i <= k; i++) {
            fast = fast.next;
            --k;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class Idx {
    public int value = 0;
}
