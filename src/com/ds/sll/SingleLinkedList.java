package com.ds.sll;

import java.util.HashSet;

public class SingleLinkedList {

    Node head;
    Node tail;

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

}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
