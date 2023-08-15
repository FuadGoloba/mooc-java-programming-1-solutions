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

public class Program {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Write a message: ");
        
        String message = scanner.nextLine();
        
        System.out.println(message);
        
    }
}
