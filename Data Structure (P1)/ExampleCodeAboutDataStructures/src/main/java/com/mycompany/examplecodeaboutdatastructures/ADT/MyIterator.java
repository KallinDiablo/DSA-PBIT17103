/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures.ADT;

import java.util.NoSuchElementException;

/**
 *
 * @author hduc2
 */
public class MyIterator<T> {

    private T[] elements;
    private int index = 0;

    public MyIterator(T[] elements) {
        this.elements = elements;
    }

    public boolean hasNext() {
        return index < elements.length;
    }

    public T next() {
        if (index >= elements.length) {
            throw new NoSuchElementException();
        }
        return elements[index++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
