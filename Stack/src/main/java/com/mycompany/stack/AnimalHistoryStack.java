/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author hduc2
 */
import java.util.LinkedList;

public class AnimalHistoryStack {
    private LinkedList<Animal> stack = new LinkedList<>();

    public void pushAnimal(Animal animal) {
        stack.addFirst(animal);
    }

    public Animal popAnimal() {
        return stack.removeFirst();
    }

    public Animal peekAnimal() {
        return stack.getFirst();
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
