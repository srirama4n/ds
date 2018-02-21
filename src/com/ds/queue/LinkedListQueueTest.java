package com.ds.queue;

public class LinkedListQueueTest {

    public static void main(String[] args) {
        validateBasicOperationsOnQueue();
    }

    private static void validateBasicOperationsOnQueue() {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        queue.printAll();

    }
}
