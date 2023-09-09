import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public void add(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void printIngredients() {
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public String toString() {
        return this.getName() + ", " + "cooking time: " + this.getTime();
    }
}
