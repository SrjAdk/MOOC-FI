
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "test";
        while(!line.equals("")){
            line = scanner.nextLine();
            String[] pieces = line.split(" ");
                for (String i : pieces){
                    if(i.contains("av")){
                        System.out.println(i);
                }
            }
            }
        }

    }

