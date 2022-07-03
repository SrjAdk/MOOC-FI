
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i;
        
        System.out.println("Where to?");
        int n = scanner.nextInt();
        
        System.out.println("Where from?");
        int j = scanner.nextInt();
        
        for (i=j;i<=n;i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
