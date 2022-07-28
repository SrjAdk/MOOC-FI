
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
    
    public String longest(){
        String returnLongest = "";
        
        if(this.elements.isEmpty()){
            return null;
        }
        for (String temp : this.elements){
            if(returnLongest.length()<temp.length()){
                returnLongest = temp;
            }
        }
        return returnLongest;
    }

}
