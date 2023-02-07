import java.util.Scanner;

public class RecipeFunctionality {
    private String command;

    public RecipeFunctionality(String command) {
        this.command = command;
    }

    public void list(Scanner fileToRead) {
        System.out.println("Recipes: ");
        while (fileToRead.hasNextLine()) {
            // we read one line
            String row = fileToRead.nextLine();
            // we print the line that we read
            System.out.println(row);
        }

    }


}