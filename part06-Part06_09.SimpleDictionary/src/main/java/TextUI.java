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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (this.isEnd(command)) {
                break;
            }
            
            this.processCommand(command);
            System.out.println("");
        }
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command) {
        if (this.isAdd(command)) {
            this.add();
        } else if (this.isSearch(command)) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public boolean isEnd(String command) {
        return command.equals("end");
    }
    
    
    public boolean isAdd(String command) {
        return command.equals("add");
    }
    
    public void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation");
        String translation = this.scanner.nextLine();
                
        this.dictionary.add(word, translation);
    }
    
    public boolean isSearch(String command) {
        return command.equals("search");
    }
    
    public void search() {
        System.out.println("To be translated:");
        String wordToTranslate = this.scanner.nextLine();
        String translatedWord = this.dictionary.translate(wordToTranslate);
        String result = "";
                              
        if (translatedWord == null) {
            result += "Word " + wordToTranslate + " was not found";
        } else {
            result = "Translation: " + translatedWord;
        }
                
        System.out.println(result);
    }

}
