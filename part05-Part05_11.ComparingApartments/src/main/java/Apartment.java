
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return (this.squares>compared.squares);
    }
    
    public int priceDifference(Apartment compared){
        if(this.princePerSquare*this.squares>compared.squares*compared.princePerSquare){
            return this.princePerSquare*this.squares-compared.squares*compared.princePerSquare;
        }else{
            return compared.princePerSquare*compared.squares-this.princePerSquare*this.squares;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.princePerSquare>compared.squares*compared.princePerSquare){
            return true;
        }else{
            return false;
        }
    }
}
