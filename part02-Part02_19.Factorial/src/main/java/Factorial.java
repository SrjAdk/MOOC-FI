
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fact = 1;
        System.out.println("Give a number: ");
        int i = scanner.nextInt();
        
        if (i==0){
            System.out.println("Factorial: 1");
        }
        
        while (i>0){
            fact = fact*i;
            i--;
        }
        System.out.println("Factorial: " + fact);
    }
}
