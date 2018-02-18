package com.ds.sll;

public class SingleLinkedListTest {

    public static void main(String[] args) {
//        validateAdd();
//        validateRemoveDuplicates();
//        validateRemoveDuplicatedWithoutBuffer();
//        validateReturnKthLast();
//        validateKthFromLastUsingIterative();
//        validateKthFromLastUsingRecursion();
//        validateDeleteNode();
//        validatePartition();
//        validatePartition2();
        validateSumLists();
    }

    private static void validateSumLists() {

        // 617 + 295 = 912
        SingleLinkedList sll1 = new SingleLinkedList();
        sll1.addLast(7);
        sll1.addLast(1);
        sll1.addLast(6);

        SingleLinkedList sll2 = new SingleLinkedList();
        sll2.addLast(5);
        sll2.addLast(9);
        sll2.addLast(2);

        Node node = SingleLinkedList.addListsOfEqualSize(sll1.head, sll2.head,0);


        SingleLinkedList.printAll(node);
    }

    private static void validatePartition2() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(3);
        sll.addLast(5);
        sll.addLast(8);
        sll.addLast(5);
        sll.addLast(10);
        sll.addLast(2);
        sll.addLast(1);
        Node node = sll.partitionUsingDualList(5);
        sll.printAll(node);
    }

    private static void validatePartition() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(3);
        sll.addLast(5);
        sll.addLast(8);
        sll.addLast(5);
        sll.addLast(10);
        sll.addLast(2);
        sll.addLast(1);
        Node node = sll.partitionUsingSingleList(5);
        sll.printAll(node);
    }

    private static void validateDeleteNode() {

        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);

        int data = sll.kthFromLastUsingSize(2);
        System.out.println("Data : " + data);
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

    static void validateKthFromLastUsingRecursion() {
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
        sll.printAll(sll.head);
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
        sll.printAll(sll.head);
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
        sll.printAll(sll.head);
    }
}
