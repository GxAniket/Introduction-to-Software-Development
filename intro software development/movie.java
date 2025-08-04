import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // TODO 1: Declare and initialize variables
        String firstName = "Aniket";
        String lastName = "Sundriyal";
        String movieTitle = "Inception";
        int numberOfTickets = 3;
        double pricePerTicket = 250.0;

        // TODO 2: Calculate total price
        double totalPrice = numberOfTickets * pricePerTicket;
        DecimalFormat df = new DecimalFormat("#0.00");

        // TODO 3: Create username by concatenating first and last name in lowercase
        String username = (firstName + lastName).toLowerCase();

        // TODO 4: Convert movie title to uppercase
        String movieName = movieTitle.toUpperCase();

        // TODO 5: Final output
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + username);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price per Ticket: ₹" + df.format(pricePerTicket));
        System.out.println("Total Cost: ₹" + df.format(totalPrice));

        // Thank-you message
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}
