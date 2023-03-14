package com.mycompany.stack;

public class Node {
    Student student;
    Node left;
    Node right;
    
    public Node(Student s) {
        student = s;
        left = null;
        right = null;
    }
}

class Student {
    String name;
    int id;
    
    public Student(String n, int i) {
        name = n;
        id = i;
    }
}

class BinaryTree {
    Node root;
    
    public BinaryTree() {
        root = null;
    }
    
    public void addStudent(Student s) {
        root = addStudentHelper(root, s);
    }
    
    private Node addStudentHelper(Node current, Student s) {
        if (current == null) {
            return new Node(s);
        }
        
        if (s.id < current.student.id) {
            current.left = addStudentHelper(current.left, s);
        } else if (s.id > current.student.id) {
            current.right = addStudentHelper(current.right, s);
        } else {
            // student already exists
        }
        
        return current;
    }
    
    public void preOrderTraversal(Node current) {
        if (current != null) {
            System.out.println(current.student.id+"\t"+current.student.name);
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }
    
    public void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.println(current.student.id+"\t"+current.student.name);
            inOrderTraversal(current.right);
        }
    }
    
    public void postOrderTraversal(Node current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            System.out.println(current.student.id+"\t"+current.student.name);
        }
    }
}
