
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Follow the instructions carefully 
        // and run the tests.
        String classroom;
        int seats;
        
        classroom = scanner.nextLine();
        seats =scanner.nextInt();
        
        Room room = new Room(classroom,seats);
        
        room.print();
        
    }

}
