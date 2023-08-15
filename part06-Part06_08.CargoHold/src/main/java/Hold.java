/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuadgoloba
 */
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public int totalWeight() {
        if (this.suitcases.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentHoldWeight = this.totalWeight();
        
        if ((suitcase.totalWeight() + currentHoldWeight) <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
        public String toString() {
        String word = "";
        if (this.suitcases.size() == 0) {
            word += "no suitcase ";
        } else if (this.suitcases.size() == 1) {
            word += this.suitcases.size() + " suitcase ";
        } else {
            word += this.suitcases.size() + " suitcases ";
        }
        return word + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
    
}
