/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scan;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }
    
    public void start(){
        ArrayList<String> jokes = this.jokes.getArray();
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                jokes.add(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                if (jokes.isEmpty()) {
                    System.out.println("Jokes are in short supply.");
                } else {
                    Random draw = new Random();
                    int index = draw.nextInt(jokes.size());
                    System.out.println(jokes.get(index));
                }
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                for (String joke : jokes) {
                    System.out.println(joke);
                }
            }
        }
    } 
}
