
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean isFound = true;
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }//end of while
            for (String temp : list) {
                if (searchedFor.equals(temp)) {
                    System.out.println("Found!");
                    isFound = false;
                    break;
                }// end of if else
            }// end of for
            if(isFound){
                System.out.println("Not found.");
            }
            

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }// end of try catch

    }
}
