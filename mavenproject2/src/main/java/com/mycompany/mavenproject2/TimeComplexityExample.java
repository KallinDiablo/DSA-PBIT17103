/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author hduc2
 */
public class TimeComplexityExample {

    public static void main(String[] args) {

        int n = 100000;
        long startTime = System.currentTimeMillis();

        // O(n^2) algorithm
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i * j;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Total time taken: " + totalTime + "ms");
    }
}
