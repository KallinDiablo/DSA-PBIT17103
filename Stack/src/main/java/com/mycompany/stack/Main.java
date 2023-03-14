package com.mycompany.stack;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 5);
        Student s2 = new Student("Bob", 12);
        Student s3 = new Student("Charlie", 3);
        Student s4 = new Student("David", 20);
        Student s5 = new Student("Eve", 7);
        
        BinaryTree tree = new BinaryTree();
        tree.addStudent(s3);
        tree.addStudent(s1);
        tree.addStudent(s5);
        tree.addStudent(s2);
        tree.addStudent(s4);
        
        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);
        
        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
        
        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
