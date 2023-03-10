package com.mycompany.stack;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        // Creating a new Stack
        Stack<String> stack = new Stack<>();

        // Pushing Elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Displaying the Stack
        System.out.println("Stack: " + stack);
    }
}