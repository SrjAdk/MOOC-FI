
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            
            if (input == 0){
                break;
            }else{
                sum = sum + input;
                System.out.println("sum" + sum);
                n++;
                System.out.println("n " +n);
                continue;
            }
        }
        double avg = (1.0*sum/n);
        System.out.println("Average of the numbers: " + avg);
    }
}
