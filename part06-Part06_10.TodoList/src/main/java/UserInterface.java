/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList list = new TodoList();
    private Scanner scan = new Scanner(System.in);

    public UserInterface(TodoList list,Scanner scanner) {
        this.list = list;
        this.scan = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("add")){
                System.out.println("To add: ");
                command = scan.nextLine();
                this.list.add(command);
            }
            if (command.equals("list")){
                this.list.print();
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int remove = scan.nextInt();
                this.list.remove(remove);
            }
            if(command.equals("stop")){
                break;
            }
        }
    }
}
