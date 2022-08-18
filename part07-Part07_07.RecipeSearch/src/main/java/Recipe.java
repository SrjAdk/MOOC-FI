
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//food name, cooking time and inredeints are stored on different variables of the object
//and the individual object is collected in a list in the Group class/.

public class Recipe {
   private ArrayList<String> recipe = new ArrayList<>();
   private String foodName;
   private int time;

    public Recipe(ArrayList<String> recipe, String foodName, int time) {
        this.recipe = recipe;
        this.foodName = foodName;
        this.time = time;
    }
    public Recipe(){
        
    }

    public ArrayList<String> getRecipe() {
        return this.recipe;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        return this.foodName +", cooking time: " + this.time;
    }
    
    
}
