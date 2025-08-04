public class StringUpperLower {
    public static void main(String args[]) {

        // B is capital
        String fruit = "Banana";

        String fruitInUpperCase = fruit.toUpperCase();
        String fruitInLowerCase = fruit.toLowerCase();

        System.out.println("The fruit: \"" + fruit + "\"");
        System.out.println("The fruit converted to uppercase: \"" + fruitInUpperCase + "\"");
        System.out.println("The fruit converted to lowercase: \"" + fruitInLowerCase + "\"");
    }
}