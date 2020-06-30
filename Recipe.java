package RecipeDatabase;

import java.util.HashSet;

public class Recipe {
    private String name;
    private HashSet<String> ingredients;
    private HashSet<String> instructions;

    public Recipe(String name, String[] ingredients,String[] instructions){
        this.name = name;
        for(String s: ingredients){
            this.ingredients.add(s);
        }
        for(String s: instructions){
            this.instructions.add(s);
        }
    }

    public String getName() {
        return this.name;
    }

    public HashSet<String> getIngredients() {
        return this.ingredients;
    }

    public HashSet<String> getInstructions() {
        return this.instructions;
    }
}
