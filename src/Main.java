import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();
        RecipeBook recipeBook = new RecipeBook(recipes);

        UserInterface ui = new UserInterface(scanner);
        UserInterface.start();


    }
}