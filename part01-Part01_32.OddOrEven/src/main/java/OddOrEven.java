
import java.util.Scanner;
import java.lang.Math;
public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int a = Integer.valueOf(scan.nextLine());
        int b = Math.abs(a);
        
        if (b%2 > 0){
            System.out.println("Number " +a+" is odd.");
        }else{
            System.out.println("Number " +a+" is even.");
        }
    }
}
