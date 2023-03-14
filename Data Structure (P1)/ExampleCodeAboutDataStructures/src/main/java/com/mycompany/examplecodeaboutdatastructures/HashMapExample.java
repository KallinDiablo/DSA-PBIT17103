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
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // Creates a new HashMap with String keys and
                                                                       // Integer values
        map.put("apple", 1); // Inserts a key-value pair "apple" -> 1 into the HashMap
        map.put("orange", 2); // Inserts a key-value pair "orange" -> 2 into the HashMap
        System.out.println(map.get("apple")); // Prints the value associated with the key "apple" (1)
        map.remove("orange"); // Removes the key-value pair associated with the key "orange"
        System.out.println(map.containsKey("orange")); // Prints whether the HashMap contains the key "orange" (false)

    }
}
