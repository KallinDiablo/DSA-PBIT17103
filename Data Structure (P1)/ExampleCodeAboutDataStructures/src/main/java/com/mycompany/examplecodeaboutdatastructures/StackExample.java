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
        Stack<Animal> animals = new Stack<>();
        animals.push(new Animal("lion", 10, "Africa"));
        animals.push(new Animal("tiger", 8, "Asia"));
        animals.push(new Animal("bear", 6, "North America"));

        while (!animals.empty()) {
            System.out.println(animals.pop());
        }
    }
}
