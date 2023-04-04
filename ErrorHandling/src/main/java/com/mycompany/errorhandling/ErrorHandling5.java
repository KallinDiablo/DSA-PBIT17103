/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

/**
 *
 * @author hduc2
 */
public class ErrorHandling5 {

    public static void main(String[] args) {
        String str = "jkasd";
        try {
            int number = Integer.parseInt(str);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer."+ e.getMessage());
        }
    }
}
