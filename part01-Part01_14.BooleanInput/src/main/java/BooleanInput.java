
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean a = Boolean.valueOf(scanner.nextLine());
        // write your program here
        System.out.println("True or false? " + a);

    }
}
