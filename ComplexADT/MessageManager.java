import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MessageManager {
    private Queue<String> messageQueue;
    private Stack<String> messageStack;

    public MessageManager() {
        messageQueue = new LinkedList<>();
        messageStack = new Stack<>();
    }

    public void enqueueMessage(String message) {
        if (message.length() <= 250) {
            messageQueue.offer(message);
        } else {
            System.out.println("Message exceeds 250 character limit.");
        }
    }

    public void sendMessage() {
        while (!messageQueue.isEmpty()) {
            String message = messageQueue.poll();
            System.out.println("Sending message: " + message);
            messageStack.push(message);
        }
    }

    public void viewMessages() {
        while (!messageStack.isEmpty()) {
            System.out.println("Received message: " + messageStack.pop());
        }
    }

    // Algorithm 1: Check if there are any messages in the queue
    public boolean hasMessages() {
        return !messageQueue.isEmpty();
    }

    // Algorithm 2: Check if a message is in the queue
    public boolean hasMessage(String message) {
        return messageQueue.contains(message);
    }

    // Algorithm 3: Get the next message in the queue without removing it
    public String peekMessage() {
        return messageQueue.peek();
    }

    // Algorithm 4: Delete all messages in the queue
    public void clearQueue() {
        messageQueue.clear();
    }
}