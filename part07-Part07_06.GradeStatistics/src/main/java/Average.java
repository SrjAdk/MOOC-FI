
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Average {
    
    private ArrayList<Integer> total;
    private int count =0;
    private int sum = 0;
    private String [] grade = {"","","","","",""};

    public Average() {
        this.total = new ArrayList<>();
    }
    
    public void add(int point){
        this.total.add(point);
        this.sum += point;
        this.count++;
        
        if(point<50&&point>=0){
            this.grade[0] += "*";
        }else if(point>=50&&point<60){
            this.grade[1] +="*";
        }else if(point>=60&&point<70){
            this.grade[2] +="*";
        }else if(point>=70&&point<80){
            this.grade[3] +="*";
        }else if(point>=80&&point<90){
            this.grade[4] +="*";
        }else if(point>=90&&point<=100){
            this.grade[5] +="*";
        }
    }
    
    
    public double getAverage(){
        return 1.0*this.sum/this.count;
    }
    
    public int size(){
        return this.count;
    }
    
    public String [] gradeDistribution(){
       return this.grade;
    }
}
