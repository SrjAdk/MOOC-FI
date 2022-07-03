
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if(!input.equals("")){
                for ( String i : split){
                    System.out.println(i);
                }
            }else{
                break;
            }
        
        }
    }
}
