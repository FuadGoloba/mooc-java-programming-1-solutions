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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        if (this.items.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item) {
        int currentSuitcaseWeight = this.totalWeight();
        
        if ((item.getWeight() + currentSuitcaseWeight) <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        String word = "";
        if (this.items.size() == 0) {
            word += "no items ";
        } else if (this.items.size() == 1) {
            word += this.items.size() + " item ";
        } else {
            word += this.items.size() + " items ";
        }
        return word + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item item : items) {
            if (item.getWeight()  > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    
}
