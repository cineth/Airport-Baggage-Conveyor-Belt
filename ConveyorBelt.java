import java.util.Scanner;
public class ConveyorBelt {
    private Node head;
    private Node tail;

    public ConveyorBelt() {
        this.head = null;
        this.tail = null;
    }

    // Add a bag to the conveyor belt
    public void checkBag(Baggage baggage) {

        Node newNode = new Node(baggage);
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.prev = null;
            //tail's next will be null
            tail.next = null;
        } else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.prev = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }

        if (newNode.getBaggage().getVIP()) { // Assuming getVIP() returns true for VIP bags.
            head = newNode;
        }else {     // Assuming getVIP() returns false for non-VIP bags.}
            tail = newNode;
        }
    }
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.baggage.getflightNumber() + " ");
            current = current.next;
        }
    }
    public void printSummary(){
        int totalBags = 0;
        int totalVIPBags = 0;
        float totalWeight = 0.0f;

        Node currentNode = head; //making new node currentNode and then making it the head
        while (currentNode != null) {
            totalBags++;
            totalWeight += currentNode.getBaggage().getKg(); // Assuming getKg() returns the bag's weight in kg.
            if (currentNode.getBaggage().getVIP()) { // Assuming getVIP() returns true for VIP bags.
                totalVIPBags++;
            }
            currentNode = currentNode.next;
        }

        System.out.println("Total Bags: " + totalBags);
        System.out.println("Total VIP Bags: " + totalVIPBags);
        System.out.println("Total Weight: " + totalWeight + " kg");

    }

    public void printDetails(){
        Node currentNode = head;
        System.out.println();
        while (currentNode != null) {
            Baggage bag = currentNode.getBaggage();
            System.out.println("Flight Number: " + bag.getflightNumber());
            System.out.println("Weight: " + bag.getKg() + " kg");
            System.out.println("Size: " + bag.getbagSize() + " cm");
            System.out.println("VIP: " + (bag.getVIP() ? "Yes" : "No"));
            System.out.println(); // Add a line break between bags

            currentNode = currentNode.next;
        }

    }
    public void loadFlight(int flightNumber){

        Node currentNode = head;
        int bagsLoaded = 0;

        while (currentNode != null) {
            if (currentNode.getBaggage().getflightNumber() == flightNumber) {
                // Found a bag with the specified flight number, remove it from the list
                if (currentNode == head && currentNode == tail) {
                    // If there's only one bag in the list
                    head = tail = null;
                } else if (currentNode == head) {
                    // If the bag is at the head
                    head = currentNode.next;
                    head.prev =null;
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

                bagsLoaded++;
            }

            currentNode = currentNode.next;
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




}
