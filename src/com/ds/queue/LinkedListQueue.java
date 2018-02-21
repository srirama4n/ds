package com.ds.queue;

public class LinkedListQueue<T> {
    QueueNode<T> head;
    QueueNode<T> tail;

    public void add(T data) {
        QueueNode<T> node = new QueueNode<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T remove() {
        QueueNode<T> old = head;
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

        QueueNode<T> node = head;
        while (node != null) {
            System.out.println("Data in Queue : " + node.data);
            node = node.next;
        }
    }

}

class QueueNode<T> {

    T data;
    QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
    }
}
