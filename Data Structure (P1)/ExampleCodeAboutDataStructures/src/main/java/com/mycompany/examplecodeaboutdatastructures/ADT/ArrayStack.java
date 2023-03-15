/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures.ADT;

/**
 *
 * @author hduc2
 */
public class ArrayStack<T> {

    private T[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IllegalStateException("ArrayStack is full.");
        }
        elements[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("ArrayStack is empty.");
        }
        return elements[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("ArrayStack is empty.");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }

    public int size() {
        return top + 1;
    }
}

