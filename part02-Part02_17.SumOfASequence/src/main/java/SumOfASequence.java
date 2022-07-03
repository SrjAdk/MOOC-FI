
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i =0;
        int sum =0;
        System.out.println("Last number?");
        int j = scanner.nextInt();
        
        while (i<=j){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
