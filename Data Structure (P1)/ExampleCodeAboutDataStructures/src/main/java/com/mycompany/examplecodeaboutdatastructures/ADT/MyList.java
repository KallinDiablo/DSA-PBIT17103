/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures.ADT;

/**
 *
 * @author hduc2
 */
public interface MyList<T> {
    void add(T element);
    T get(int index);
    T remove(int index);
    int size();
}