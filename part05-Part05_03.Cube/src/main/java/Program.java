
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        System.out.println("Enter the edge length: ");
        length = scanner.nextInt();
        
        Cube cube = new Cube(length);
        
        System.out.println(cube.volume());
        System.out.println(cube);
        // Experiment with your program here
    }
}
