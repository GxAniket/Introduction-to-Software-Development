import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String[] args) {

        // TODO 2: Create a Scanner variable named "keyboard"
        Scanner keyboard = new Scanner(System.in);

        // TODO 8: Declare subChoice variable here
        int subChoice;

        // TODO 3: Initialize the dayOfTheWeek to 1
        int dayOfTheWeek = 1;

        // TODO 4: Display the menu
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for day of the week. Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");

        // TODO 5: Prompt Toni for input
        System.out.print("Enter the day of the week (1-7): ");
        dayOfTheWeek = keyboard.nextInt();

        // TODO 6: switch-case for dayOfTheWeek
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");

                // TODO 9: Sub-menu for Monday
                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");
                System.out.println("**************************************");

                // TODO 10: Prompt for input and store in subChoice
                System.out.print("Enter your choice: ");
                subChoice = keyboard.nextInt();

                // TODO 11: Handle choices using if-else
                if (subChoice == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM. Prepare your notes.");
                } else if (subChoice == 2) {
                    System.out.println("Let us divert on Highway 54 and have a Burger on the drive in.");
                } else {
                    System.out.println("NO such choice available.");
                }

                break;

            case 2:
                System.out.println("Tuesday: Team meeting at 10AM.");
                break;

            case 3:
                System.out.println("Wednesday: Project deadline approaching. Stay focused!");
                break;

            case 4:
                System.out.println("Thursday: Review and plan for next week.");
                break;

            case 5:
                System.out.println("Friday: Wrap-up pending tasks.");
                break;

            case 6:
                System.out.println("Saturday: Relax and enjoy your weekend!");
                break;

            case 7:
                System.out.println("Sunday: Family time and recharge.");
                break;

            // TODO 6(b): Handle invalid input
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }

        // Close scanner
        keyboard.close();
    } // end of main method

} // end of the main class
