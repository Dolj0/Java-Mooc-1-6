
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        
        String printOutput = "";
                
        if (this.elements.size()==1){
            printOutput = "The collection "+this.name+" has "+elements.size()+" element:";
        } else {
            printOutput = "The collection "+this.name+" has "+elements.size()+" elements:";
        }
            
        
        
        String added = "";
        
        if (elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        }
            
        for (int i = 0; i<elements.size(); i++){
            if (this.elements.size()==1){
                added = elements.get(i);
                break;
            }
            String get = elements.get(i);
            added = added + get + "\n";
        }
        
        return printOutput + "\n" + added;
    }
    
}
