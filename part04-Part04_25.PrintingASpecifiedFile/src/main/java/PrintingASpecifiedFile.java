
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        System.out.println("Enter the file name: ");
        fileName = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
