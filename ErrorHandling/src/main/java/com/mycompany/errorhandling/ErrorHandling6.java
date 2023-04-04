/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

/**
 *
 * @author hduc2
 */

public class ErrorHandling6 {
    public static void print(int a)
    {
         if(a>=18){
          System.out.println("Eligible for Voting");
          }
          else{
    
          throw new IllegalArgumentException("Not Eligible for Voting");
                                    
          }
       
    }
    public static void main(String[] args) {
        ErrorHandling6.print(14);
    }
}
