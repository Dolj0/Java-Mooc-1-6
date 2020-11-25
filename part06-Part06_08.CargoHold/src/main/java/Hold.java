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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
         this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        Suitcase g = suitcase;
        int i = 0;
        for (int j = 0; j<suitcases.size();j++){
            i = i + suitcases.get(j).totalWeight();
        }
        if (i+g.totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        
        for (int j = 0; j<suitcases.size(); j++){
            suitcases.get(j).printItems();
        }
    }
    
    @Override
    public String toString(){
        int i = 0;
        
        for (int j = 0; j<suitcases.size(); j++){
            i = i + suitcases.get(j).totalWeight();
        }
        
        String s = " ";
        
        if (suitcases.size() == 1) {
            s = suitcases.size() + " suitcase ("+ i + " kg)";
        } else if (suitcases.size() == 0){
            s = "no suitcases ("+ i + " kg)";
        } else {
            s = suitcases.size() + " suitcases ("+ i + " kg)";
        }
        
        return s;
    }
    
}
