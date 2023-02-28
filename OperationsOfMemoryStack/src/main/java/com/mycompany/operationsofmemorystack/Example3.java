/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operationsofmemorystack;

/**
 *
 * @author hduc2
 */
public class Example3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = multiply(a, b);
        System.out.println(result);
    }

    public static int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return x + multiply(x, y - 1);
        }
    }

}
