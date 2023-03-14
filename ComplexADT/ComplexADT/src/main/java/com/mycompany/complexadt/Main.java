/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexadt;

/**
 *
 * @author hduc2
 */
public class Main {
    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
      
        // Enqueue messages
        messageManager.enqueueMessage("Hello, world!");
        messageManager.enqueueMessage("This is a test message.");
      
        // Send messages
        messageManager.sendMessage();
      
        // View received messages
        messageManager.viewMessages();
    }
}
