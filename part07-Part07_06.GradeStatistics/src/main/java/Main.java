
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average average = new Average();
        Average passingGrade = new Average();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int in = scanner.nextInt();
            if(in == -1){
                break;
            }else if(in>=0&&in<=100){
                average.add(in);
            }
            if(in>=50&&in<=100){
                passingGrade.add(in);
            }
        }
        System.out.println("Point average (all): "+average.getAverage());
        if(passingGrade.size()==0){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " + passingGrade.getAverage());
        }
        System.out.println("Pass percentage: "+ (100.0*passingGrade.size()/average.size()));
        String [] grade = average.gradeDistribution();
        for(int i = grade.length; i>0;i--){
            System.out.println(i-1+": "+ grade[i-1]);
        }
    }
}
