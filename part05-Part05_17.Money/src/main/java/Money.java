
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
    
    public Money plus(Money addition) {
        Money totalMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return totalMoney; 
    }
    
    public boolean lessThan(Money compared) {
        
        if (this.euros > compared.euros) {
            return false;
        }
        else if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }

        return true;
    }
    
    public Money minus(Money decreaser) {

        int centsRemainder = 0;
        int eurosRemainder = 0;
        
        if (this.euros < decreaser.euros & this.cents < decreaser.cents) {
            return new Money(eurosRemainder, centsRemainder);
        }
        
        if (this.euros >= decreaser.euros) {
            if (this.cents < decreaser.cents) {
                centsRemainder = (100 + this.cents) - decreaser.cents;
                eurosRemainder = (this.euros - 1) - decreaser.euros;
            } else {
                centsRemainder = this.cents - decreaser.cents;
                eurosRemainder = this.euros - decreaser.euros;
            }
        }
        return new Money(eurosRemainder, centsRemainder);
    }

}
