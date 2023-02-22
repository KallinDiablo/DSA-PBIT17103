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
        Queue<Animal> animals = new LinkedList<>();
        animals.add(new Animal("lion", 10, "Africa"));
        animals.add(new Animal("tiger", 8, "Asia"));
        animals.add(new Animal("bear", 6, "North America"));

        while (!animals.isEmpty()) {
            System.out.println(animals.remove());
        }
    }
}
