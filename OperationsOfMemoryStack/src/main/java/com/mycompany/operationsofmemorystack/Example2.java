/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operationsofmemorystack;

/**
 *
 * @author hduc2
 */
public class Example2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sum(numbers);
        System.out.println(result);
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

}
