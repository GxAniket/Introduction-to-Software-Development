import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;


        // for menu choice
        int menuChoice = 1;

        /** TODO 8 (a) Solution: Create appropriate one object of class Tiger
         *                       and one object of class Dolphin, at the top of the main method.
         */
        Tiger tigerObject = new Tiger();

        Dolphin dolphinObject = new Dolphin();

        /** TODO 8 (a) Solution End **/

        /** TODO 10 (a) Solution: Create a Penguin object after the Dolphin object.*/
        Penguin penguinObject = new Penguin();
        /** TODO 10 (a) Solution End **/

         do {
             /** TODO 8 (b) Solution: Create a menu system to choose between a tiger or a dolphin.
              *                       Leverage the use of the method animalChoiceMenu() which is provided.
              */
             switch (animalChoiceMenu(keyboard)) {
                 case 1:
                     do {
                             System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                             menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                             switch (menuChoice) {
                                 case 1:
                                     System.out.println("Enter the number of Stripes:");
                                     tigerObject.setNumberOfStripes(keyboard.nextInt());

                                     System.out.println("Enter speed:");
                                     tigerObject.setSpeed(keyboard.nextInt());

                                     System.out.println("Enter decibel of roar:");
                                     tigerObject.setSoundLevel(keyboard.nextInt());
                                     break;

                                 case 2:
                                     System.out.println("The characteristics of the " + tigerObject.getNameOfAnimal() + ":");
                                     System.out.println("Age: " + tigerObject.getAge());
                                     System.out.println("Height: " + tigerObject.getHeight());
                                     System.out.println("Weight: " + tigerObject.getWeight());
                                     System.out.println("Number of stripes: " + tigerObject.getNumberOfStripes());
                                     System.out.println("Speed: " + tigerObject.getSpeed());
                                     System.out.println("Sound level of roar: " + tigerObject.getSoundLevel());

                                     break;
                                 case 3:
                                     tigerObject.walking();
                                     break;
                                 case 4:
                                     tigerObject.eatingFood();
                                     tigerObject.eatingCompleted();
                                     break;
                                 default:
                                     System.out.println("Not supported");

                             }
                         System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                         continueInnerLoop = keyboard.nextInt();
                 } while(continueInnerLoop == 1);

                     break;
                 case 2:
                     do{
                             System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                             menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                             switch (menuChoice) {
                                 case 1:
                                     // clear issues with reading strings after numbers
                                     keyboard.nextLine();

                                     System.out.println("Enter the color of the dolphin:");
                                     dolphinObject.setColor(keyboard.nextLine());

                                     System.out.println("Enter the speed of the dolphin:");
                                     dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                     break;

                                 case 2:
                                     System.out.println("The characteristics of the " + dolphinObject.getNameOfAnimal() + ":");
                                     System.out.println("Age: " + dolphinObject.getAge());
                                     System.out.println("Height: " + dolphinObject.getHeight());
                                     System.out.println("Weight: " + dolphinObject.getWeight());
                                     System.out.println("Color:" + dolphinObject.getColor());
                                     System.out.println("Speed:" + dolphinObject.getSwimmingSpeed());
                                     break;
                                 case 3:
                                     dolphinObject.swimming();
                                     break;
                                 case 4:
                                     dolphinObject.eatingFood();
                                     dolphinObject.eatingCompleted();
                                     break;
                                 default:
                                     System.out.println("Not supported");

                             }
                         System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                         continueInnerLoop = keyboard.nextInt();
                     } while(continueInnerLoop == 1);

                     break;
                 /** TODO 10 (c) Solution: integrate the choice to pick a "penguin" in the menu system **/
                 case 3:
                     do{
                         System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                         menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                         switch (menuChoice) {
                             case 1:
                                 System.out.println("Is the penguin swimming (true/false):");
                                 penguinObject.setSwimming(keyboard.nextBoolean());

                                 System.out.println("Enter the walk speed of the penguin:");
                                 penguinObject.setWalkSpeed(keyboard.nextInt());

                                 System.out.println("Enter the swim speed of the penguin:");
                                 penguinObject.setSwimSpeed(keyboard.nextInt());
                                 break;

                             case 2:
                                 System.out.println("The characteristics of the " + penguinObject.getNameOfAnimal() + ":");
                                 System.out.println("Age: " + penguinObject.getAge());
                                 System.out.println("Height: " + penguinObject.getHeight());
                                 System.out.println("Weight: " + penguinObject.getWeight());
                                 System.out.println("Walking Speed:" + penguinObject.getWalkSpeed());
                                 System.out.println("Swimming Speed:" + penguinObject.getSwimSpeed());
                                 break;
                             case 3:
                                 if (penguinObject.isSwimming()) {
                                     penguinObject.swimming();
                                 } else {
                                     penguinObject.walking();
                                 }
                                 break;
                             case 4:
                                 penguinObject.eatingFood();
                                 penguinObject.eatingCompleted();
                                 break;
                             default:
                                 System.out.println("Not supported");

                         }
                         System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                         continueInnerLoop = keyboard.nextInt();
                     } while(continueInnerLoop == 1);
                     break;
                 /** TODO 10 (c) Solution End **/
                 default:
                     System.out.println("Sorry no such animal available.");
             }
             /** TODO 8 (b) Solution End **/

             System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
             continueOuterLoop = keyboard.nextInt();

         } while(continueOuterLoop == 1);



        /** TODO 10 Solution: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        /** TODO 10 (b) Solution: integrate the choice to pick a "penguin" in the menu system **/
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal (1-3):");
        /** TODO 10 (b) Solution End **/

        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }

}



