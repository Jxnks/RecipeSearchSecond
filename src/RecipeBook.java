import java.util.ArrayList;

public class RecipeBook {

    private static ArrayList<Recipes> recipes = new ArrayList<>();

    public RecipeBook(Recipes recipes){
        this.recipes = new ArrayList<Recipes>();
    }

    public static void add(Recipes recipe) {
        recipes.add(recipe);
    }







}
