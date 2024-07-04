# RecipeManager

## Overview

RecipeManager is a Java application for managing a collection of recipes. The application allows users to create new recipes, add ingredients to recipes, view all recipes, and print detailed information about each recipe.

## Features

- Add new recipes
- Add ingredients to recipes
- View all recipe names
- Print detailed information for all recipes
- Calculate total calories for each recipe

## Project Structure

The project consists of the following main classes:

- `Ingredient`: Represents an ingredient with attributes such as name, number of cups, calories per cup, and total calories.
- `Recipe`: Represents a recipe with attributes such as recipe name, servings, a list of ingredients, and total recipe calories.
- `RecipeBox`: Represents a collection of recipes with methods to add new recipes, print all recipe names, and print all recipe details.
- `Main`: The driver class that allows user interaction with the RecipeManager system.

## Setup

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/RecipeManager.git
   cd RecipeManager

2. **Compile the Java Files**:
   ```sh
   javac *.java
   
3. **Run the Application**:
   ```sh
   java Main
   ```
## Documentation
The Javadoc documentation for this project is generated and located in the doc folder. You can view the documentation by opening doc/index.html in your web browser.

## How to Use
Add a New Recipe:

Follow the prompts to enter the recipe name and number of servings.
Add ingredients by specifying the ingredient name, number of cups, and calories per cup.
Continue adding ingredients or finish the recipe by typing "no" when prompted to add another ingredient.
Print All Recipe Names:

Select the option to view all recipe names stored in the RecipeBox.
Print All Recipe Details:

Select the option to view detailed information about each recipe, including ingredients and total calories.
Exit the Application:

Choose the option to exit the program.
Contributing
If you wish to contribute to this project, please fork the repository and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.
