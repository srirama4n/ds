package com.ds.sll;

import java.util.HashSet;

public class SingleLinkedList {

    Node head;
    Node tail;
    int size;

    public static void printAll(Node node) {
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

    public void partitionUsingDualNodes(Node node, int x) {


    }

    public Node partitionUsingSingleList(int x) {

        Node node = head;
        Node newHead = head;
        Node newTail = head;
        while (node != null) {
            Node next = node.next;
            node.next = null;
            if (node.data < x) {
                node.next = newHead;
                newHead = node;
            } else {
                newTail.next = node;
                newTail = node;
            }
            node = next;
        }

        return newHead;
    }

    public Node partitionUsingDualList(int x) {

        Node node = head;
        Node beforeHead = null;
        Node beforeTail = null;
        Node afterHead = null;
        Node afterTail = null;
        while (node != null) {
            Node next = node.next;
            node.next = null;
            if (node.data < x) {
                if (beforeHead == null) {
                    beforeHead = node;
                    beforeTail = node;
                } else {
                    beforeTail.next = node;
                    beforeTail = node;
                }
            } else {
                if (afterHead == null) {
                    afterHead = node;
                    afterTail = node;
                } else {
                    afterTail.next = node;
                    afterTail = node;
                }
            }
            node = next;
        }

        beforeTail.next = afterHead;
        return beforeHead;
    }

    public static Node addListsOfEqualSize(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null) {
            return null;
        }
        int value = carry;
        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value += l2.data;
        }
        Node node = new Node(value % 10);
        Node next = addListsOfEqualSize(l1.next, l2.next, value >= 10 ? 1 : 0);
        node.next = next;
        return node;
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
