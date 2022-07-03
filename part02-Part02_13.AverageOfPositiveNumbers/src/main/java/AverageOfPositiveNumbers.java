
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int n = 0;
        int input =1;
        int positive = 0;
        int negative = 0;
        
        while(input !=0){
            input = scanner.nextInt();
            if (input>0){
                sum+=input;
                n++;
                positive++;
            }else if (input <0){
                negative++;
            }
        }
        if ((negative > 0) && (positive == 0)){
            System.out.println("Cannot calculate the average");
        }else if((negative ==0)&& (positive==0)&& (input == 0)){
            System.out.println("Cannot calculate the average");
        }else{
            double avg = 1.0*sum/n;
            System.out.println(avg);
        }
    }
    
}

