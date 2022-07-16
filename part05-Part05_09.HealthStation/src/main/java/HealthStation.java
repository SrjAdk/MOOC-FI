
public class HealthStation {
    private int count =0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter        
        count++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weight = person.getWeight()+1;        
        person.setWeight(weight);
    }
    
    public int weighings(){
        return count;
    }
}
