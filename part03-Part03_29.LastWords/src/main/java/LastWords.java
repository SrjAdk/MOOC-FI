
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "test";
        while(!line.equals("")){
            line = scanner.nextLine();
            String[] pieces = line.split(" ");
            System.out.println(pieces[pieces.length -1]);
        }

    }
}
