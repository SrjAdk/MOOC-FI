
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.println("First number?");
        int i = scanner.nextInt();
        
        System.out.println("Last number?");
        int j = scanner.nextInt();
        
        while (i<=j){
            sum += i;
            i++;
        }
        System.out.println("The sum is: "+sum);
    }
}
