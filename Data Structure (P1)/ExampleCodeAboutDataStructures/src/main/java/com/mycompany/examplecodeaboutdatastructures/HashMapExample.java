/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;



/**
 *
 * @author hduc2
 */
import java.util.HashMap;
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Animal> animals = new HashMap<>();
        animals.put("lion", new Animal("lion", 10, "Africa"));
        animals.put("tiger", new Animal("tiger", 8, "Asia"));
        animals.put("bear", new Animal("bear", 6, "North America"));

        System.out.println(animals.get("lion"));
    }
}
