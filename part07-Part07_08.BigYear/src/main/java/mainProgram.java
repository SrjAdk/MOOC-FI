
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<String []> birds = new ArrayList<>();
        
        String command = "";
        

        while (!command.equalsIgnoreCase("quit")) {
            String[] populate = new String[3];

            System.out.println("?");
            command = scan.nextLine();
            int j = 0;
            if (command.equalsIgnoreCase("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                populate[0] = name;
                populate[1] = latinName;
                populate[2] = "0";
                System.out.println(Arrays.toString(populate));
                birds.add(populate);
                
                j++;
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.println("Bird?");
                String birdObservation = scan.nextLine();
                boolean isBird = true;
                for(int i = 0; i<birds.size();i++){
                     if(birds.get(i)[0].equalsIgnoreCase(birdObservation)){
                        int obs = Integer.valueOf(birds.get(i)[2]);
                        obs++;
                        birds.get(i)[2]= String.valueOf(obs);
                        break;
                    }else{
                        isBird = false;
                    }
                }
                if(isBird == false){ 
                    System.out.println("Not a Bird!");
                }
            }else if (command.equalsIgnoreCase("All")){
                for(int i = 0; i<birds.size();i++){
                    System.out.println(birds.get(i)[0]+" ("+birds.get(i)[1]+") " + birds.get(i)[2] + " observations");
                }
            }else if(command.equalsIgnoreCase("One")){
                System.out.println("Bird?");
                String findBird = scan.nextLine();
                for(int i = 0; i<birds.size();i++){
                    if(findBird.equalsIgnoreCase(birds.get(i)[0])){
                        System.out.println(birds.get(i)[0]+" ("+birds.get(i)[1]+") " + birds.get(i)[2] + " observations");
                    }
                }
            }
        }
    }

}
