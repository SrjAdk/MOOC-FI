
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true){
            input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }//end of if
            
            int cube= Integer.valueOf(input);
            System.out.println(cube*cube*cube);
            
        }//end of while
    }
}
