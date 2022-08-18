
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// stores all the Recipe object in List so that we can grab individual object easily.

public class Group {
    private ArrayList<Recipe> group = new ArrayList<>();

    public Group() {
        
    }
    public void add(Recipe recipe){
        this.group.add(recipe);
    }

    public ArrayList<Recipe> getGroup() {
        return this.group;
    }
    
    
    
}
