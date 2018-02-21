package com.ds.stack;

public class LinkedListStackTest {

    public static void main(String[] args) {
        validateBasicStack();
    }

    static void validateBasicStack(){

        LinkedListStack<Integer> stack  = new LinkedListStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.printAll();
    }
}
