import java.util.Scanner;

/**
 * The Main class is the driver class to test the Recipe management system.
 */
public class Main {
    public static void main(String[] args) {
        RecipeBox recipeBox = new RecipeBox();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Recipe Box Management:");
            System.out.println("1. Add a new recipe");
            System.out.println("2. Print all recipe names");
            System.out.println("3. Print all recipe details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String recipeName = scanner.nextLine();
                    System.out.print("Enter number of servings: ");
                    int servings = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Recipe newRecipe = new Recipe(recipeName, servings);

                    while (true) {
                        System.out.print("Add an ingredient (yes/no)? ");
                        String addIngredient = scanner.nextLine();
                        if (addIngredient.equalsIgnoreCase("no")) {
                            break;
                        }

                        System.out.print("Enter ingredient name: ");
                        String ingredientName = scanner.nextLine();
                        System.out.print("Enter number of cups: ");
                        float numberCups = scanner.nextFloat();
                        System.out.print("Enter calories per cup: ");
                        int caloriesPerCup = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        
                        Ingredient ingredient = new Ingredient(ingredientName, numberCups, caloriesPerCup);
                        newRecipe.addIngredient(ingredient);
                    }

                    recipeBox.addNewRecipe(newRecipe);
                    break;

                case 2:
                    recipeBox.printAllRecipeNames();
                    break;

                case 3:
                    recipeBox.printAllRecipeDetails();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}