
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while(true){
            int input = scanner.nextInt();
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int small =9999;
        for (int i=0;i<list.size();i++){
            int number = list.get(i);
            if(number<small){
                small=number;
            }
        }
        System.out.println("Smallest number: "+small);
        for(int i=0;i<list.size();i++){
            int check = list.get(i);
            if(check==small){
                System.out.println("Found at index: "+i);
            }
        }
    }
}
