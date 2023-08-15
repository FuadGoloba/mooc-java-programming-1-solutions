
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double affordableMealPrice = 2.50;
    private static final double heartyMealPrice = 4.30;
    


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= affordableMealPrice) {
            this.money += affordableMealPrice;
            this.affordableMeals++;
            return payment - affordableMealPrice;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMealPrice) {
            this.affordableMeals++;
            return card.takeMoney(this.affordableMealPrice);
        }
        return false;
        //return card.takeMoney(this.affordableMealPrice);
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= heartyMealPrice) {
            this.money += heartyMealPrice;
            this.heartyMeals++;
            return payment - heartyMealPrice;
        }
        return payment ;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        
        if (card.balance() >= this.heartyMealPrice) {
            this.heartyMeals++;
            return card.takeMoney(this.heartyMealPrice);
        }
        return false;
        //return card.takeMoney(this.heartyMealPrice);
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
