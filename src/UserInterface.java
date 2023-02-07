import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Recipes recipes;
    private RecipeBook recipeBook;


    public UserInterface(Scanner scanner, Recipes recipes, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.recipeBook = recipeBook;
        this.recipes = recipes;
    }

    public UserInterface(Scanner scanner, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }


    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        Scanner fileToRead = new Scanner(Paths.get(file));
        System.out.println("""
                Commands:
                list - lists the recipes
                stop - stops the program
                find name - searches recipes by name
                find cooking time - searches recipes by cooking time\n""");
        commands(fileToRead);
    }

    public static void commands(Scanner fileToRead){
        Scanner scanner = new Scanner(System.in);
        String defaultCommand = "Incorrect command entered";
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            RecipeFunctionality rc = new RecipeFunctionality(input);
            switch (input) {
                case "list":
                    rc.list(fileToRead);
                case "stop":
                    break;
                default:
                    String defaultCommand1 = defaultCommand;
            }
        }

    }
}
