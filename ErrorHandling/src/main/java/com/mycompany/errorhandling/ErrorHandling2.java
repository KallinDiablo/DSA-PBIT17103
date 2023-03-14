/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

/**
 *
 * @author hduc2
 */
public class ErrorHandling2 {

    public static void main(String[] args) {
        String str = null;
        try {
            if (str.equals("Hello")) {
                System.out.println("Hello world!");
            }
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
