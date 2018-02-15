package com.ds.sll;

public class SingleLinkedListTest {

    public static void main(String[] args) {
        validateAdd();
    }

    static void validateAdd() {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);
        sll.printAll();
    }
}
