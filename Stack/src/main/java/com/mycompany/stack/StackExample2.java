package com.mycompany.stack;

import java.util.Stack;

public class StackExample2{
    public static void main(String[] args) {
        // Creating a new Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing Elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping Elements from the Stack
        int poppedElement1 = stack.pop();
        int poppedElement2 = stack.pop();

        // Displaying the Popped Elements and the Remaining Stack
        System.out.println("Popped Elements: " + poppedElement1 + ", " + poppedElement2);
        System.out.println("Remaining Stack: " + stack);
    }
}
