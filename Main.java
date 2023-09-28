import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        ConveyorBelt conveyorBelt = new ConveyorBelt(); // Create an instance of ConveyorBelt

            //the bag size limit is 50 for testing the removeOverSize
            //Remove all of the bags with the given flight number(5) to test loadFlight method


            // Create a Baggage object with the user-provided information
            Baggage newBag0 = new Baggage(0, 10, 10, false); // this bag fits within bag limit and is not flight 5, but is NOT VIP
            Baggage newBag1 = new Baggage(1, 10, 10, true); // this bag fits within bag limit and is not flight 5, but IS VIP
            Baggage newBag2 = new Baggage(2, 10, 10, false); // this bag fits within bag limit and is not flight 5, but is NOT VIP
            Baggage newBag3 = new Baggage(3, 10, 10, true); // this bag fits within bag limit and is not flight 5, but IS VIP
            Baggage newBag4 = new Baggage(4, 10, 100, true); // this bag DOES NOT fit within bag limit so get removed from belt
            Baggage newBag5 = new Baggage(5, 10, 10, true); // this flight number is 5 which all the bags with the given flight number(5) gets removed from belt


            // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag0);  // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag1);  // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag2);  // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag3);  // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag4);  // Add the bag to the conveyor belt
            conveyorBelt.checkBag(newBag5);  // Add the bag to the conveyor belt

            conveyorBelt.removeOverSize(); // calls conveyorBelt.removeOverSize()
            conveyorBelt.loadFlight();      // calls conveyorBelt.loadFlight();
            conveyorBelt.printSummary(); // printDetails method to display the summary
            conveyorBelt.printDetails(); // calls conveyorBelt.printDetails();
            conveyorBelt.displayFlightNumbers(); // calls conveyorBelt.displayFlightNumbers();
    }
}
