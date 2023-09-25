import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {

        Scanner bagscan = new Scanner(System.in);
        Baggage newBag = new Baggage();

        // Prompt for and set Flight number for bag
        System.out.print("Enter Flight Number: ");
        int flightNumber = bagscan.nextInt();
        newBag.setflightNumber(flightNumber);

        Scanner bagscan = new Scanner(System.in);
        Baggage newBag = new Baggage();

        // Prompt for and set Flight number for bag
        System.out.print("Enter Flight Number: ");
        int flightNumber = bagscan.nextInt();
        newBag.setflightNumber(flightNumber);




        //create a DoublyLinkedList object
        Node dl_List = new Node(1);
        //Add nodes to the list
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);

        //print the nodes of DoublyLinkedList
        dl_List.printNodes();
    }


}
