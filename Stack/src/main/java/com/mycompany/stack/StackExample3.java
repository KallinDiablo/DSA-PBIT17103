package com.mycompany.stack;

import java.util.Stack;

public class StackExample3{
    public static void main(String[] args) {
        // Creating a new Stack
        Stack<String> stack = new Stack<>();

        // Checking if the Stack is Empty
        if (stack.empty()) {
            System.out.println("The Stack is Empty!");
        } else {
            System.out.println("The Stack is Not Empty!");
        }
    }
}
