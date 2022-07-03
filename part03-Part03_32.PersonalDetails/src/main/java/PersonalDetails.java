
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nameLength = 0;
        int sum = 0;
        int count = 0;
        String name = " ";
        while (true){
           String info = scanner.nextLine();
           if(info.equals("")){
               break;
           }
           String[] piece = info.split(",");
           if(piece[0].length()>nameLength){
               nameLength = piece[0].length();
               name = piece[0];
           }
           sum = sum + Integer.valueOf(piece[1]);
           count++;
           
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: " + 1.0*sum/count);
    }
}
