/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Creates a new ArrayList of type String
        list.add("hello"); // Adds the string "hello" to the end of the ArrayList
        list.add("world"); // Adds the string "world" to the end of the ArrayList
        System.out.println(list.get(0)); // Prints the first element of the ArrayList ("hello")
        list.remove(1); // Removes the second element of the ArrayList ("world")
        System.out.println(list.size()); // Prints the size of the ArrayList (1)
    }
}
