import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {

        Baggage newBag = new Baggage();


        // Prompt for and set Flight number for bag
        Scanner bagscan = new Scanner(System.in);
        System.out.print("Enter Flight Number: ");
        int flightNumber = bagscan.nextInt();
        newBag.setflightNumber(flightNumber);

        // Prompt for and set Bag Weight
        Scanner weightscan = new Scanner(System.in);
        System.out.print("Enter Bag Weight : ");
        float bagWeight = weightscan.nextFloat();
        newBag.setKg(bagWeight);

        // Prompt for and set Bag Dimensions
        Scanner sizescan = new Scanner(System.in);
        System.out.print("Enter Bag Dimensions : ");
        float bagSize = sizescan.nextFloat();
        newBag.setbagSize(bagSize);

        // Prompt for and set Bag Dimensions
        Scanner vipscan = new Scanner(System.in);
        System.out.print("Enter Vip Details : ");
        boolean VIP = vipscan.nextBoolean();
        newBag.setVIP(VIP);






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
