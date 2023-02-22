/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
public class ArrayExample {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
animals[0] = new Animal("lion", 10, "Africa");
animals[1] = new Animal("tiger", 8, "Asia");
animals[2] = new Animal("bear", 6, "North America");

for (Animal animal : animals) {
    System.out.println(animal);
}
    }
}
