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
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            
            if (input.equals("1")){
                System.out.print("Write the joke to be added: ");
                String s = scanner.nextLine();
                this.jokeManager.addJoke(s);
            }
            
            if (input.equals("2")){
                System.out.println(this.jokeManager.drawJoke());
            }
            
            if (input.equals("3")){
                this.jokeManager.printJokes();
            }
            
            if (input.equals("X")){
                break;
            }
            
        }
        
    }
    
        
    
}
