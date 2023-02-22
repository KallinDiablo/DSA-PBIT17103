/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author hduc2
 */
import java.util.Stack;

public class AnimalStack {
    private Stack<Animal> stack = new Stack<>();

    public void pushAnimal(Animal animal) {
        stack.push(animal);
    }

    public Animal popAnimal() {
        return stack.pop();
    }

    public Animal peekAnimal() {
        return stack.peek();
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
