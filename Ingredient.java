/**
 * The Ingredient class represents an ingredient with a name, quantity in cups,
 * calories per cup, and total calories.
 */
public class Ingredient {
    private String nameOfIngredient;
    private float numberCups;
    private int numberCaloriesPerCup;
    private double totalCalories;

    /**
     * Constructs an Ingredient with the specified name, number of cups, and calories per cup.
     *
     * @param nameOfIngredient the name of the ingredient
     * @param numberCups the number of cups of the ingredient
     * @param numberCaloriesPerCup the number of calories per cup
     */
    public Ingredient(String nameOfIngredient, float numberCups, int numberCaloriesPerCup) {
        this.nameOfIngredient = nameOfIngredient;
        this.numberCups = numberCups;
        this.numberCaloriesPerCup = numberCaloriesPerCup;
        this.totalCalories = calculateTotalCalories();
    }

    // Getters and Setters with Javadoc comments
    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    public float getNumberCups() {
        return numberCups;
    }

    public void setNumberCups(float numberCups) {
        this.numberCups = numberCups;
        this.totalCalories = calculateTotalCalories();
    }

    public int getNumberCaloriesPerCup() {
        return numberCaloriesPerCup;
    }

    public void setNumberCaloriesPerCup(int numberCaloriesPerCup) {
        this.numberCaloriesPerCup = numberCaloriesPerCup;
        this.totalCalories = calculateTotalCalories();
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    private double calculateTotalCalories() {
        return numberCups * numberCaloriesPerCup;
    }

    public Ingredient addIngredient(String ingredientName) {
        return new Ingredient(ingredientName, 0, 0);
    }
}