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
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            this.processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("list")) {
            this.list();
        } else if (command.equals("remove")) {
            this.remove() ;
        }
    }
    
    public void add() {
        System.out.println("To add:");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }
    
    public void list() {
        this.todoList.print();
    }
    
    public void remove() {
        System.out.println("WHich one is removed");
        int taskId = Integer.valueOf(this.scanner.nextLine());
        
        this.todoList.remove(taskId);
    }
}
