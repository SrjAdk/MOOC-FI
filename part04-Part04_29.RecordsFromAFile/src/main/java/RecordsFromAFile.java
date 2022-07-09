
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        String year;
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] data = line.split(",");
                if(Integer.valueOf(data[1])==1){
                    year = "year";
                }else{
                    year = "years";
                }
                System.out.println(data[0] + ", age: "+data[1]+" "+year);
                
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
