public class Main {

    // method to gather ingredients
    public static void gatherIngredients() {
        String[] ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "lettuce";

        System.out.println("All ingredients arranged:");
        for (String item : ingredients) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        // call the method
        gatherIngredients();
    }
}

// output 
//All ingredients arranged:
//- bread
//- chicken slices
//- cheese slices
//- lettuce
