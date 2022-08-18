
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] split = input.split(" ");
            
            String command = split[0];
            
            int amount = Integer.valueOf(split[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                if(first.contains()>=amount){
                    second.add(amount);
                    first.remove(amount);
                }else if(amount>=first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }

}
