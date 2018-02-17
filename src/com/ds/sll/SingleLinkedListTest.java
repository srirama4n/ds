package com.ds.sll;

public class SingleLinkedListTest {

    public static void main(String[] args) {
//        validateAdd();
        validateRemoveDuplicates();
        validateRemoveDuplicatedWithoutBuffer();
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
