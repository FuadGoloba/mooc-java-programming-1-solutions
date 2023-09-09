import java.util.ArrayList;

public class RecipeCollection {
    private ArrayList<Recipe> recipes;

    public RecipeCollection() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void print() {
        System.out.println("\nRecipes: ");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void findRecipeByName(String recipeName) {
        System.out.println("\nRecipes: ");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(recipeName)) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipeByCookingTime(int cookingTime) {
        System.out.println("\nRecipes: ");
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipeByIngredient(String ingredient) {
        System.out.println("\nRecipes: ");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
