/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); // Creates a new stack of integers
        stack.push(1); // Pushes the integer 1 onto the top of the stack
        stack.push(2); // Pushes the integer 2 onto the top of the stack
        System.out.println(stack.peek()); // Prints the top element of the stack (2)
        stack.pop(); // Removes the top element of the stack (2)
        System.out.println(stack.peek()); // Prints the new top element of the stack (1)
    }
}
