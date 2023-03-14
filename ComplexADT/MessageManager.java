import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

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
    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
    
        messageManager.enqueueMessage("Hello, world!");
        messageManager.enqueueMessage("This is a test message.");
        messageManager.sendMessage();
        messageManager.viewMessages();
    }
}
