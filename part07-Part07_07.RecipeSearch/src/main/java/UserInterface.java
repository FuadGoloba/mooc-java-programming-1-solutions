import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private RecipeCollection collection;

    public UserInterface(Scanner scanner, RecipeCollection collection) {
        this.scanner = scanner;
        this.collection = collection;
    }

    public void readFromFile(String file) {
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String name = reader.nextLine();
                int time = Integer.valueOf(reader.nextLine());
                Recipe recipe = new Recipe(name, time);
                while(reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                         break;
                     }
                    recipe.add(ingredient);
                }
                this.collection.add(recipe);
            }
        }
        catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        //return this.collection;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
        this.readFromFile(file);

        System.out.println("\nCommands: \nlist - lists the recipes \nstop - stops the program \nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time \nfind ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.print("\nEnter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                this.collection.print();
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = this.scanner.nextLine();
                this.collection.findRecipeByName(name);
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(this.scanner.nextLine());
                this.collection.findRecipeByCookingTime(cookingTime);
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = this.scanner.nextLine();
                this.collection.findRecipeByIngredient(ingredient);
            }
        }
    }
}
