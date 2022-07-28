/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> item;
    private int maxWeight;
    private int suitCaseWeight;

    public Suitcase(int maxWeight) {
        this.item = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.suitCaseWeight = 0;
    }
    
    public void addItem(Item item){
        if(this.suitCaseWeight + item.getWeight()<=this.maxWeight){
            this.item.add(item);
            this.suitCaseWeight += item.getWeight();
        }
        
    }
    
    public void printItems(){
        for ( Item i : this.item){
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)"); 
        }
    }
    
    public int totalWeight(){
        return this.suitCaseWeight;
    }
    
    public Item heaviestItem(){
        Item toReturn = new Item("",0);
        if(this.item.isEmpty()){
            return null;
        }
        for(Item i : this.item){
            if(i.getWeight()>toReturn.getWeight()){
                toReturn = i;
            }
        }
        return toReturn;
        
    }
    
    public int getSuitcaseWeight(){
        return this.suitCaseWeight;
    }
    
    public String toHold(){
        String print = "";
        for ( Item i : this.item){
            print += (i.getName() + " (" + i.getWeight() + " kg)"+"\n"); 
        }
        return print;
    }

    @Override
    public String toString() {
        if(this.item.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.item.size()==1){
            return "1 item (" + this.suitCaseWeight + " kg)";
        }
        return this.item.size() +" items" + "("+ this.suitCaseWeight +" kg)" ;
    }
    
    
    
}
