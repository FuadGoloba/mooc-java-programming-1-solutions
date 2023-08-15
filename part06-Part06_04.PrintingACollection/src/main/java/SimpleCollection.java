
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
    
    public String toString() {
        String printOutput = "The collection " + this.name + " is empty.";
        
        if (this.elements.isEmpty()) {
            return printOutput;
        }
        
        String printElement = "";
        for (String element : this.elements) {
            printElement += "\n" + element;
        }
        
        String elementString = " element";
        if (this.elements.size() > 1) {
            elementString += "s";
        }
        
        printOutput = "The collection " + this.name + " has " + this.getElements().size() + elementString +  ":" + printElement;
        
        return printOutput;
    }
}
