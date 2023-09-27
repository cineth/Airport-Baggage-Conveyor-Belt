import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        ConveyorBelt conveyorBelt = new ConveyorBelt(); // Create an instance of ConveyorBelt

        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            // Prompt for and set Flight number for bag
            System.out.print("Enter Flight Number (or -1 to exit or -2 to remove bag from flight): ");
            int flightNumber = inputScanner.nextInt();

            // Check if the user wants to exit
            if (flightNumber == -1) {
                break; // Exit the loop
            }
            if (flightNumber == -2) {
                System.out.print("Enter Flight Number you are looking for: ");
                int search = inputScanner.nextInt();
                conveyorBelt.loadFlight(search); // Exit the loop
                break;

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


            conveyorBelt.checkBag(newBag);  // Add the bag to the conveyor belt
            conveyorBelt.removeOverSize(); // calls conveyorBelt.removeOverSize(bagSize)

        }


        conveyorBelt.printSummary(); //  printDetails method to display the summary
        conveyorBelt.printDetails(); // calls conveyorBelt.printDetails();
        conveyorBelt.displayFlightNumbers(); // calls conveyorBelt.displayFlightNumbers();

        inputScanner.close(); // Close the scanner when done.


    }

}
