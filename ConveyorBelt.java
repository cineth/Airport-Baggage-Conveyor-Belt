import java.util.Scanner;
public class ConveyorBelt {
    private Node head;
    private Node tail;

    private int length;

    public ConveyorBelt() {
        this.head = null;
        this.tail = null;
    }

    // Add a bag to the conveyor belt
    public void checkBag(Baggage baggage) {
        Node newNode = new Node(baggage);

        if (head == null) {  // If the conveyor belt is empty, add the bag as the first item

            head = tail = newNode;
        } else {// If the conveyor belt is not empty

            if (baggage.getVIP()) { // If it's a VIP bag, place it at the head (beginning)

                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else { // If it's a regular bag, place it at the end

                newNode.prev = tail; // update the previous node reference of newNode to the current tail
                tail.prev = newNode; // updates previous reference of current tail to point to the new node
                tail = newNode; // updates tail reference to point to the new node
            }
        }
    }


    public void printSummary(){

        int totalBags = 0; // intialize total number of bags
        int totalVIPBags = 0; // intialize total number of VIP bags
        float totalWeight = 0.0f; // intialize total weight of all bags

        Node currentNode = head; //making new node currentNode and then making it the head(first node in linked list)

        while (currentNode != null) { // iterates through the linked list stopping at currentNode when null(end of list)
            totalBags++; //count for each bag encountered in the linked list
            totalWeight += currentNode.getBaggage().getKg(); // accessing my new nodes baggage's weight and adding it to the total weight
            if (currentNode.getBaggage().getVIP()) { // if the bag is a VIP bag add to the total number of VIP bags
                totalVIPBags++;
            }
            currentNode = currentNode.next; // move to the next node in link list
        }

        System.out.println("Total Bags: " + totalBags);
        System.out.println("Total VIP Bags: " + totalVIPBags);
        System.out.println("Total Weight: " + totalWeight + " kg");

    }

    public void printDetails(){
        Node currentNode = head; //making new node currentNode and then making it the head(first node in linked list)
        System.out.println(); // Add a line break between bags
        while (currentNode != null) { // iterates through the linked list stopping at currentNode when null(end of list)
            Baggage bag = currentNode.getBaggage(); //  access to (flight number, weight, size, and VIP status) of the new bag
            System.out.println("Flight Number: " + bag.getflightNumber());
            System.out.println("Weight: " + bag.getKg() + " kg");
            System.out.println("Size: " + bag.getbagSize() + " cm");
            System.out.println("VIP: " + (bag.getVIP() ? "Yes" : "No"));
            System.out.println(); // Add a line break between bags

            currentNode = currentNode.next; // move to the next node in link list
        }

    }
    public void loadFlight(int flightNumber){

        Node currentNode = head; //making new node currentNode and then making it the head(first node in linked list)
        int bagsLoaded = 0; // initialize a variable bagsLoaded to keep track of the number of bags

        while (currentNode != null) { // iterates through the linked list stopping at currentNode when null(end of list)
            if (currentNode.getBaggage().getflightNumber() == flightNumber) { //checks if initialized flight number is same as inputted
                // Found a bag with the specified flight number, remove it from the list
                if (currentNode == head && currentNode == tail) {
                    // indicates an empty list
                    head = tail = null;
                } else if (currentNode == head) {
                    // If the bag is at the head update to point to next bag then set prev to null
                    head = currentNode.next;
                    head.prev =null;
                } else if (currentNode == tail) {
                    // If the bag is at the tail update to point to previous bag then set next to null
                    tail = currentNode.prev;
                    tail.next = null;
                } else {
                    // If the bag is in the middle - connect the previous and next nodes effectively removing the bag
                    Node prevNode = currentNode.prev; // Get the previous node
                    Node nextNode = currentNode.next; // Get the next node
                    prevNode.next = nextNode; // Connect previous node to the next node
                    nextNode.prev = prevNode; // Connect next node to the previous node
                }

                bagsLoaded++;
            }

            currentNode = currentNode.next; //Move to the next node in the linked list
        }

        System.out.println("Loaded " + bagsLoaded + " bags with flight number " + flightNumber);

    }
    public void removeOverSize() {
        Node currentNode = head;
        int bagsRemoved = 0;
        float maxSize = 50;

        while (currentNode != null) {
            if (currentNode.getBaggage().getbagSize() > maxSize) {
                // Found a bag that exceeds the maximum size, remove it from the list
                if (currentNode == head && currentNode == tail) {
                    // If there's only one bag in the list
                    head = tail = null;
                } else if (currentNode == head) {
                    // If the bag is at the head
                    head = currentNode.next;
                    head.prev = null;
                } else if (currentNode == tail) {
                    // If the bag is at the tail
                    tail = currentNode.prev;
                    tail.next = null;
                } else {
                    // If the bag is in the middle
                    Node prevNode = currentNode.prev;
                    Node nextNode = currentNode.next;
                    prevNode.next = nextNode;
                    nextNode.prev = prevNode;
                }

                bagsRemoved++;
            }

            currentNode = currentNode.next;
        }

        System.out.println("Removed " + bagsRemoved + " bags over size " + maxSize + " cm");
    }

    public void displayFlightNumbers() {
        Node currentNode = head; // Start at the head of the list

        System.out.println("Flight Numbers on the Conveyor Belt:");

        while (currentNode != null) {
            int flightNumber = currentNode.getBaggage().getflightNumber();
            System.out.println("Flight Number: " + flightNumber);

            currentNode = currentNode.next; // Move to the next node
        }
    }





}
