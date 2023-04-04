/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

/**
 *
 * @author hduc2
 */
public class ErrorHandling7 {
    public static void  print(int a,int b)
     {
         System.out.println("Addition of Positive Integers :"+(a+b));
     }
     
    public static void main(String[] args) {
    int n1=7;
    int n2=-3;
     if(n1>=0 && n2>=0)
     {
         ErrorHandling7.print(n1,n2);
     }
     else
     {
         throw new IllegalStateException("Either one or two numbers are not Positive Integer");
     }
    }
}
