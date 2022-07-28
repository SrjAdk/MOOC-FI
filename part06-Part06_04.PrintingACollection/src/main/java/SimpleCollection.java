
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);        
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String names = "";
        int i = 1;
        if(this.elements.isEmpty()){
            return "The collection " + this.name+ " is empty.";
        }
        for(i = 1; i<=this.elements.size();i++){
            names = names + "\n" + this.elements.get(i-1);
        }
        if(this.elements.size()==1){
            return ("The collection " +this.name + " has " + (i-1) + " element:" + names);
        }else{
        return ("The collection " +this.name + " has " + (i-1) + " elements:" + names);
        }
    }
    
    
}
