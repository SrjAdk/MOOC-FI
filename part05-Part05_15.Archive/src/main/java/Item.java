/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compare){
        Item compareNew = (Item) compare;
        
        return this.identifier.equals(compareNew.identifier);
    }

    @Override
    public String toString() {
        return  this.identifier + ": " + this.name;
    }
    
    
}
