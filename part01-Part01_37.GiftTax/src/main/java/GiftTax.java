
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax;
        
        System.out.println("Value of the gift?");
        int a = Integer.valueOf(scan.nextLine());
        
        if(a<5000){
            System.out.println("No tax!");
        }else if (a==5000){
            System.out.println("Tax: 100");   
        }else if (a>=5000 && a<25000){
            int b = a - 5000;
            tax = 100 + 0.08*b;
            System.out.println("Tax: " + tax);
        }else if (a>=25000 && a<55000){
            int b = a - 25000;
            tax = 1700 + 0.1*b;
            System.out.println("Tax: "+tax);
        }else if (a>=55000 && a<200000){
            int b = a - 55000;
            tax = 4700 + 0.12*b;
            System.out.println("Tax: "+tax);
        }else if (a>=200000 && a<1000000){
            int b= a- 200000;
            tax = 22100+.15*b;
            System.out.println("Tax: "+tax);
        }else if (a>=1000000){
            int b = a - 1000000;
            tax = 142100 + 0.17*b;
            System.out.println("Tax: "+tax);
        }
    }
}
