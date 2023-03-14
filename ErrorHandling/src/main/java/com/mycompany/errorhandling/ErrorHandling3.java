/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

/**
 *
 * @author hduc2
 */
public class ErrorHandling3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
    
}
