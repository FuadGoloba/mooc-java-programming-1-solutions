/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuadgoloba
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfseconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfseconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredthsOfseconds.advance();
        
        if (this.hundredthsOfseconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hundredthsOfseconds;
    }
    
}
