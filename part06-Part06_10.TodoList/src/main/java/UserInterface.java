/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todo;
    
    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }
    
    public void start(){
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")){
                System.out.print("To add: ");
                String word = scanner.nextLine();
                todo.add(word);
                continue;
            }
            
            if (input.equals("list")){
                todo.print();
                continue;
            }
            
            if (input.equals("remove")){
                System.out.println("Which one is removed? ");
                int i = Integer.valueOf(scanner.nextLine());
                todo.remove(i);
            }
            
        }
        
    }
    
}
