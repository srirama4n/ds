package com.ds.stack;

public class SortStackTest {

    public static void main(String[] args) {
        System.out.println("Sort stack");

        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.printAll();
        sort(stack);
        System.out.println("-------- Sorted Stack ----------");
        stack.printAll();

    }

    static void sort(LinkedListStack<Integer> stack) {
        LinkedListStack<Integer> tempStack = new LinkedListStack<>();
        Integer tempData;

        while (!stack.isEmpty()) {
            tempData = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > tempData) {
                stack.push(tempStack.pop());
            }
            tempStack.push(tempData);
        }

        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
}
