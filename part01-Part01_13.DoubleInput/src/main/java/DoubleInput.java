
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double a = Double.valueOf(scanner.nextLine());
        // write your program here
        System.out.println("You gave the number " + a);
    }
}
