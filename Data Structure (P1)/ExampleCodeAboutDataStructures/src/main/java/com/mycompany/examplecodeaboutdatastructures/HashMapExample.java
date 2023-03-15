/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplecodeaboutdatastructures;

/**
 *
 * @author hduc2
 */
import com.mycompany.examplecodeaboutdatastructures.ADT.MyHashMap;

public class HashMapExample {

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        System.out.println(map.get("apple")); // 1
        System.out.println(map.get("banana")); // 2
        System.out.println(map.get("cherry")); // 3
        System.out.println(map.containsKey("banana")); // true
        System.out.println(map.containsKey("durian")); // false

        map.remove("banana");
        System.out.println(map.containsKey("banana")); // false
        System.out.println(map.size()); // 2
    }
}
