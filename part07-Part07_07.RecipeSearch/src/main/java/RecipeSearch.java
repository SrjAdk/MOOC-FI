
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipe recipe;
        Group group = new Group();
        System.out.println("File to read: ");
        String filename = scanner.nextLine();

        ArrayList<String> populate = new ArrayList<>();

        try ( Scanner scan = new Scanner(Paths.get(filename))) {

            while (scan.hasNext()) {
                //collects each line untill it finds an empty line or the end of the file
                String row = scan.nextLine();
                populate.add(row);
                
                if (row.isEmpty() || !scan.hasNextLine()) {
                    group.add(sort(populate));
                    //a block of lines containing food name, cooking time and ingredients
                    //are thrown to sort method which returns a recipe object which is stored
                    //in the Object list in "Group" class
                    populate.clear();
                }
            }
            //after the whole file is read, the UI stats here
            start(group);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static Recipe sort(ArrayList<String> input) {
        int i = 0;
        String name = "";
        int time = 0;
        ArrayList<String> ingredients = new ArrayList<>();
        
        for (String temp : input) {
            if (i == 0) {
                //1st position contains food name
                name = temp;
            } else if (i == 1) {
                //second position contains cooking time
                time = Integer.valueOf(temp);
            } else {
                //the remaining contains ingredeints
                ingredients.add(temp);
            }
            i++;
        }
        //creates a new Recipe object from above data
        Recipe recipe = new Recipe(ingredients, name, time);
        //returns Recipe object to be stored in Group class
        return recipe;
    }

    public static void start(Group group) {
        System.out.println("Command:\nlist - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n"
                + "Enter command: ");
        while (true) {

            Scanner s = new Scanner(System.in);
            String command = s.nextLine();
            ArrayList<String> recipe1 = new ArrayList<>();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe r : group.getGroup()) {
                    System.out.println(r.getFoodName() + ", cooking time:" + r.getTime());
                }

                break;
            } else if (command.equals("find name")) {
                System.out.println("Search word: ");
                String searchWord = s.nextLine();
                if (searchWord.isEmpty()) {
                    System.out.println("Not Found");
                    break;
                }
                for (Recipe r : group.getGroup()) {
                    if (r.getFoodName().toLowerCase().contains(searchWord.toLowerCase())) {
                        System.out.println(r.getFoodName());
                    }
                }

                break;
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = s.nextInt();
                for (Recipe r : group.getGroup()) {
                    if (time >= r.getTime()) {
                        System.out.println(r);
                    }
                }
                break;
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredients ");
                String word = s.nextLine();
                int i = 0;
                while (i < group.getGroup().size()) {
                    recipe1 = group.getGroup().get(i).getRecipe();
                    
                    for (String re : recipe1) {
                        if (re.equals(word))
                        {
                            System.out.println(group.getGroup().get(i));
                        }
                    }
                    i++;
                }

                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
