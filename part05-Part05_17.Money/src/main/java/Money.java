
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        int newEuro = this.euros + addition.euros;
        int newCent = this.cents + addition.cents;
        return new Money(newEuro,newCent);
    }
    
    public boolean lessThan(Money compared){
        int tempCents = this.euros*100 + this.cents;
        int compare = compared.euros*100 + compared.cents;
        
        if(tempCents>compare){
            return false;
        }else{
            return true;
        }
    }
    
    public Money minus(Money decreaser){
        int newEuro = this.euros - decreaser.euros;
        int newCent = this.cents - decreaser.cents;
        int tempCent = newEuro*100 + newCent;
        
        if(tempCent<0){
            return new Money(0,0);
        }else if(tempCent >0){
            newEuro = tempCent/100;
            newCent = tempCent - newEuro*100;
        }
        return new Money(newEuro,newCent);
        
    }
}
