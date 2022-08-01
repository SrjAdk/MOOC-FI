/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Container {
   private int first;
   
   
   public Container() {
       this.first =0;
       
    }
   
    public int contains(){
       return this.first;
   } 
    
   public void add(int amount){
       if(amount>0){ 
            this.first += amount;
       }
       if(this.first>100){
           this.first =100;
       }
   }
   
   public void remove(int amount){
       if(amount<this.first){
           this.first-=amount;
       }
       if(amount>this.first){
           this.first = 0;
       }
       
   }

    @Override
    public String toString() {
        return this.first + "/100";
    }
   
}
