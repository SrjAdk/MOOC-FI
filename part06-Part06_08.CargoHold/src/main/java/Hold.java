/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    private int totalWeight =0;

    public Hold(int maxWeight) {
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight+suitcase.getSuitcaseWeight()<=this.maxWeight){
            this.hold.add(suitcase);
            this.totalWeight += suitcase.getSuitcaseWeight();
        }
    }   
    
    public void printItems(){
        for(Suitcase s : this.hold){
            System.out.print(s.toHold());
        }
    }

    @Override
    public String toString() {
        return this.hold.size() + " suitcases (" + this.totalWeight + " kg)";
    }
    
    
}
