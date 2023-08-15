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

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }
    
    public void start() {
        this.processCommand();
    }
    
    public void printCommands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
    
    public void processCommand() {
        while(true) {
            this.printCommands();
            String command = this.scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            } else if (command.equals("3")) {
                this.jokeManager.printJokes();
            }
        }   
    }
    
}
