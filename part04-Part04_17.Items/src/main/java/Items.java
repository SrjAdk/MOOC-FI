
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: ");
        while (true){
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            items.add(new Item(name));
        }
        for(Item temp: items){
            System.out.println(temp);
        }
    }
}
