/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.errorhandling;

import java.util.Scanner;

/**
 *
 * @author hduc2
 */
public class Main {
    public static void main(String[] args) {
       try {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
