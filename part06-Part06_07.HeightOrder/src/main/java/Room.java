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

public class Room {
    private ArrayList<Person> room;
   
    
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return room;
    }
    
    public Person shortest(){
        
        if (this.room.isEmpty()){
            return null;
        }
       
        int j = 100;
        int k = 0;
        for (int i = 0; i<room.size(); i++){
            if (j>room.get(i).getHeight()){
                j=room.get(i).getHeight();
                k=i;
            }
        }
        return room.get(k);
    }
    
    public Person take(){
        
        
        
        if (this.room.isEmpty()){
            return null;
        }
        
        Person returnObject = room.get(0);
        
        int j = 200;
        int k = 0;
        for (int i = 0; i<room.size(); i++){
            if (j>room.get(i).getHeight()){
                j=room.get(i).getHeight();
                k=i;
                returnObject = room.get(i);
            }
        }
        
        room.remove(k);
        return returnObject;
    }
}
