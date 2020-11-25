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

public class TodoList {
    private ArrayList<String> tasks; 
    
    public TodoList(){
        this.tasks = new ArrayList();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        for (int i = 0; i<this.tasks.size(); i++){
            int k = i + 1;
            System.out.println((k)+": "+this.tasks.get(i));
        }
        
    }
    
    public void remove(int number){
        this.tasks.remove(number-1);
    }
    
}
