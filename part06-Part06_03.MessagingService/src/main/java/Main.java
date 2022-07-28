
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Saroj", "test message");
        
        MessagingService m = new MessagingService();
        
        m.add(message);
        
        System.out.println(m.getMessages());
    }
}
