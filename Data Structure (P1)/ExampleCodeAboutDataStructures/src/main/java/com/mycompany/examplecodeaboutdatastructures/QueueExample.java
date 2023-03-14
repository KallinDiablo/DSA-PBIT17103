/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>(); // Creates a new queue of strings using a linked list
                                                        // implementation
        queue.add("hello"); // Adds the string "hello" to the back of the queue
        queue.add("world"); // Adds the string "world" to the back of the queue
        System.out.println(queue.peek()); // Prints the first

    }
}
