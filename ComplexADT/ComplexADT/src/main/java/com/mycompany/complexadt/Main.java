/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexadt;

/**
 *
 * @author hduc2
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MessageManager manager = new MessageManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enqueue message");
            System.out.println("2. Send message");
            System.out.println("3. View messages");
            System.out.println("4. Check if there are any messages");
            System.out.println("5. Check if a message is in the queue");
            System.out.println("6. Get the next message in the queue without removing it");
            System.out.println("7. Delete all messages in the queue");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter message to enqueue: ");
                    String message = scanner.nextLine();
                    manager.enqueueMessage(message);
                    break;

                case 2:
                    manager.sendMessage();
                    break;

                case 3:
                    manager.viewMessages();
                    break;

                case 4:
                    if (manager.hasMessages()) {
                        System.out.println("There are messages in the queue.");
                    } else {
                        System.out.println("There are no messages in the queue.");
                    }
                    break;

                case 5:
                    System.out.print("Enter message to check: ");
                    message = scanner.nextLine();
                    if (manager.hasMessage(message)) {
                        System.out.println("The message is in the queue.");
                    } else {
                        System.out.println("The message is not in the queue.");
                    }
                    break;

                case 6:
                    message = manager.peekMessage();
                    System.out.println("Next message in the queue: " + message);
                    break;

                case 7:
                    manager.clearQueue();
                    System.out.println("Queue cleared.");
                    break;

                case 8:
                    System.out.println("Exiting menu...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}
