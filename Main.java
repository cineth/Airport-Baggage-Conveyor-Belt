import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ConveyorBelt conveyorBelt = new ConveyorBelt(); // Create an instance of ConveyorBelt

        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            // Prompt for and set Flight number for bag
            System.out.print("Enter Flight Number (or -1 to exit): ");
            int flightNumber = inputScanner.nextInt();

            // Check if the user wants to exit
            if (flightNumber == -1) {
                break; // Exit the loop
            }

            // Prompt for and set Bag Weight
            System.out.print("Enter Bag Weight : ");
            float bagWeight = inputScanner.nextFloat();

            // Prompt for and set Bag Dimensions
            System.out.print("Enter Bag Dimensions : ");
            float bagSize = inputScanner.nextFloat();

            // Prompt for and set Bag Dimensions
            System.out.print("Enter Vip Details : ");
            boolean VIP = inputScanner.nextBoolean();

            // Create a Baggage object with the user-provided information
            Baggage newBag = new Baggage(flightNumber, bagWeight, bagSize, VIP);

            // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag);
        }

        // Call the print
        // Summary or printDetails method to display the summary
        conveyorBelt.printSummary(); // or conveyorBelt.printDetails();

        inputScanner.close(); // Close the scanner when done.


    }

}
