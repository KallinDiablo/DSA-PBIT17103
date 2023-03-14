public class main {
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
