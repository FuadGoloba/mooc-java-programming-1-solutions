/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuadgoloba
 */

import java.util.Scanner;
public class ClockProgram {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How long do you want the clock to run for in seconds?");
        int stopClock = Integer.valueOf(scan.nextLine());
        Clock clock = new Clock();
        int startClock = 0;
        while (startClock <= stopClock) {
            System.out.println(clock);
            clock.advance();
            
            startClock++;
        }
        
    }
    
}
