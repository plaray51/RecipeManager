import java.util.ArrayList;

/**
 * The RecipeBox class represents a collection of recipes.
 */
public class RecipeBox {
    private ArrayList<Recipe> listOfRecipes;

    /**
     * Constructs an empty RecipeBox.
     */
    public RecipeBox() {
        this.listOfRecipes = new ArrayList<>();
    }

    /**
     * Constructs a RecipeBox with the specified list of recipes.
     *
     * @param listOfRecipes the list of recipes
     */
    public RecipeBox(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    public ArrayList<Recipe> getListOfRecipes() {
        return listOfRecipes;
    }

    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    public void printAllRecipeDetails() {
        for (Recipe recipe : listOfRecipes) {
            recipe.printRecipe();
        }
    }

    public void printAllRecipeNames() {
        for (Recipe recipe : listOfRecipes) {
            System.out.println("Recipe: " + recipe.getRecipeName());
        }
    }

    public void addNewRecipe(Recipe recipe) {
        listOfRecipes.add(recipe);
    }
}