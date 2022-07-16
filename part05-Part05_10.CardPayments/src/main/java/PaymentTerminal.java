
public class PaymentTerminal {

    private double money = 1000.0;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        if (payment >= 2.5) {
            this.money += 2.5;
            change = payment - 2.5;
            affordableMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        if (payment >= 4.3) {
            this.money += 4.3;
            change = payment - 4.3;
            heartyMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.5) {

            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        } else {
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 4.3) {

            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if(sum>0){
        card.addMoney(sum);
        this.money+=sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
