/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        int i = 1;
        for(String task : list){
            System.out.println(i+": " + task);
            i++;
        }
    }
    
    public void remove(int number){
        this.list.remove(number-1);
    }
}
