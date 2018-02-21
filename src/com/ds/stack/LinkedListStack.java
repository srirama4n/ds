package com.ds.stack;

public class LinkedListStack<T> {

    StackNode<T> head;

    public void push(T data) {
        StackNode<T> node = new StackNode<>(data);
        node.next = head;
        head = node;
    }

    public T pop() {
        if (head == null) {
            throw new RuntimeException("Stack Under Flow Exception");
        }
        StackNode<T> old = head;
        head = head.next;
        return old.data;
    }

    public T peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printAll() {
        StackNode<T> node = head;
        while (node != null) {
            System.out.println("Data is : "+node.data);
            node = node.next;
        }
    }

}

class StackNode<T> {

    T data;
    StackNode<T> next;

    public StackNode(T data) {
        this.data = data;
    }
}


