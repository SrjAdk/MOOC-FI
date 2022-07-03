
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        divisibleByThreeInRange(a,b);
        
    }
    public static void divisibleByThreeInRange(int i, int j){
        while(i<=j){
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
