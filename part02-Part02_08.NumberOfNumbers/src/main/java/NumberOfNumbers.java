
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        while (true){
            
            System.out.println("Give a number:");
            int a = scanner.nextInt();
            if (a==0){
                System.out.println("Number of numbers: "+i);
                break;
            }else{
                i++;
                continue;
            }
            
        }
    }
}
