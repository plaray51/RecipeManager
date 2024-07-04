import java.util.ArrayList;

/**
 * The Recipe class represents a recipe with a name, number of servings, ingredients, and total calories.
 */
public class Recipe {
    private String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients;
    private double totalRecipeCalories;

    /**
     * Constructs a Recipe with the specified name and number of servings.
     *
     * @param recipeName the name of the recipe
     * @param servings the number of servings
     */
    public Recipe(String recipeName, int servings) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0;
    }

    // Getters and Setters with Javadoc comments
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = calculateTotalRecipeCalories(); // Update total recipe calories
    }

    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }

    private double calculateTotalRecipeCalories() {
        double total = 0;
        for (Ingredient ingredient : recipeIngredients) {
            total += ingredient.getTotalCalories();
        }
        return total;
    }

    public void printRecipe() {
        System.out.println("Recipe: " + recipeName);
        System.out.println("Servings: " + servings);
        for (Ingredient ingredient : recipeIngredients) {
            System.out.println("Ingredient: " + ingredient.getNameOfIngredient() +
                               ", Cups: " + ingredient.getNumberCups() +
                               ", Calories per Cup: " + ingredient.getNumberCaloriesPerCup() +
                               ", Total Calories: " + ingredient.getTotalCalories());
        }
        System.out.println("Total Recipe Calories: " + totalRecipeCalories);
    }

    public Recipe addNewRecipe(String recipeName, int servings) {
        return new Recipe(recipeName, servings);
    }

    public void addIngredient(Ingredient ingredient) {
        this.recipeIngredients.add(ingredient);
        this.totalRecipeCalories = calculateTotalRecipeCalories(); // Update total recipe calories
    }
}