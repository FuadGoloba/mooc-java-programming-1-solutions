/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuadgoloba
 */
public class ClockHand {
    private int value;
    private int limit;
    
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }
    
    public int value() {
        return this.value;
    }
    
    public void advance() {
        this.value++;
        
        if (this.value >= limit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
