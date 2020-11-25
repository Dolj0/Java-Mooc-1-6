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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase (int maxWeight){
        this.maxWeight=maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        Item g = item;
        int i = 0;
        for (int j = 0; j<items.size();j++){
            i = i + items.get(j).getWeight();
        }
        if (i+g.getWeight() <= this.maxWeight){
            items.add(item);
        }
    }
    
    public void printItems(){
        String s = "";
        
        for (int j = 0; j<items.size(); j++){
            String a = items.get(j).getName() + " (" + items.get(j).getWeight() + " kg)"; 
            System.out.println(a);
        }
       
    }
    
    public int totalWeight(){
        int i = 0;
        
        for (int j = 0; j<items.size(); j++){
            i = items.get(j).getWeight() + i;
        }
        return i;
    }
    
    public Item heaviestItem(){
        int i=0;
        int k=0;
        int l=0;
        int z=0;
        
        if (items.isEmpty()){
            return null;
        }
                
        for (int j = 0; j<items.size(); j++){
            i = items.get(j).getWeight();
            if (i>k){
                k=i;
                z=j;
            }
        }
        return items.get(z);
    }
    
    @Override
    public String toString(){
        
        int i = 0;
        
        for (int j = 0; j<items.size(); j++){
            i = i + items.get(j).getWeight();
        }
        String s = " ";
        
        if (items.size() == 1) {
            s = items.size() + " item ("+ i + " kg)";
        } else if (items.size() == 0){
            s = "no items ("+ i + " kg)";
        } else {
            s = items.size() + " items ("+ i + " kg)";
        }
        
        return s;
    }
}
