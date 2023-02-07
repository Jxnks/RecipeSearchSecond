import java.util.ArrayList;

public class Recipes {
    private String recipeName;
    private int cookingTime;
    private String ingredients;
    private static ArrayList<String> fullRecipeDetails = new ArrayList<>();

    public Recipes(){
        fullRecipeDetails = new ArrayList<String>();
    }


    public Recipes(String recipeName, int cookingTime, String ingredients){
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        fullRecipeDetails = new ArrayList<String>();
    }

    public void setName(String name){
        this.recipeName = name;
    }

    public String getName(){
        return this.recipeName;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return recipeName + ", " + "cooking time: " + cookingTime;
    }
}
