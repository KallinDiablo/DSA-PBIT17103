/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures.ADT;

/**
 *
 * @author hduc2
 */
public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("MyQueue is empty.");
        }
        T dequeuedElement = list.get(0);
        list.remove(0);
        return dequeuedElement;
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("MyQueue is empty.");
        }
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}