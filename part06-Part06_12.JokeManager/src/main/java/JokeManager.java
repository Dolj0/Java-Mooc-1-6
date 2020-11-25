/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        
        if (jokes.isEmpty()){
            return "Jokes are in short supply.";
        } else {
            int rnd = new Random().nextInt(jokes.size());
            return jokes.get(rnd);
        }
        
    }
    
    public void printJokes(){
        
        if (jokes.isEmpty()){
            System.out.println("Jokes are in short supply.");
        }
        for (int i = 0; i<jokes.size(); i++){
            System.out.println(jokes.get(i));
        }
    }
    
}
