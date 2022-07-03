
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greater=0;
        int dummy;
        
        while(true){
            String input= scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] piece = input.split(",");
            
            dummy = Integer.valueOf(piece[1]);
            if(dummy>greater){
                greater = dummy;
            }
        }
        System.out.println("Age of the oldest: "+greater);
    }
}
