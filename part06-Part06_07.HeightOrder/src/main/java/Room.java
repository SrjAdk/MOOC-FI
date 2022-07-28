/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> person;

    public Room(){
        this.person = new ArrayList<>();
    }
    
    public void add(Person person){
        this.person.add(person);
    }
    
    public boolean isEmpty(){
        if(this.person.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return this.person;
    }
    
    public Person shortest(){
        if(this.person.isEmpty()){
            return null;
        }
        Person reference = this.person.get(0);
        
        int shortest = reference.getHeight();
        for(Person temp : this.person){
            if(shortest>temp.getHeight()){
                shortest = temp.getHeight();
                reference = temp;
            }
            
        }
        return reference;
    }
    
    public Person take(){
        Person shortest = this.shortest();
        this.person.remove(shortest);
        return shortest;
    }
}
