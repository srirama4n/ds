package com.ds.sll;

public class SingleLinkedListTest {

    public static void main(String[] args) {
//        validateAdd();
//        validateRemoveDuplicates();
//        validateRemoveDuplicatedWithoutBuffer();
//        validateReturnKthLast();
//        validateKthFromLastUsingIterative();
        validateKthFromLastUsingRecusrsion();
    }

    static void validateReturnKthLast() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);

        int data = sll.kthFromLastUsingSize(2);
        System.out.println("Data : " + data);
    }

    static void validateKthFromLastUsingIterative() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);

        int data = sll.kthFromLastUsingIterative(2);
        System.out.println("Data : " + data);
    }

    static void validateKthFromLastUsingRecusrsion() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);

        int data = sll.kthFromLastUsingRecursion(sll.head, 2);
        System.out.println("Data : " + data);
    }

    static void validateAdd() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);
        sll.printAll();
    }

    static void validateRemoveDuplicates() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(2);
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(2);
        sll.addLast(3);
        sll.removeDuplicatedUsingHashSet();
        sll.printAll();
    }

    static void validateRemoveDuplicatedWithoutBuffer() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(2);
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(2);
        sll.addLast(3);
        sll.removeDuplicatedWithoutBuffer();
        sll.printAll();
    }
}
