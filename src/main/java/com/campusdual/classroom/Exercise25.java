package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");

        System.out.println("Element on top: " + stack.peek());

        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop() + " is now removed.");
            }
        } else {
            System.out.println("Elements were not found because stack is empty.");
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = createStack();
        printAndEmptyStack(stack);
    }
}
