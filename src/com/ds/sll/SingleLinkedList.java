package com.ds.sll;

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
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
