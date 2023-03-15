/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
import com.mycompany.examplecodeaboutdatastructures.ADT.MyQueue;

public class QueueExample {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");
        System.out.println(queue.dequeue()); // prints "Hello"
        System.out.println(queue.peek()); // prints "World"
        System.out.println(queue.isEmpty()); // prints false
        System.out.println(queue.size()); // prints 1
    }

}
