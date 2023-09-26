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
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
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
            currentNode = currentNode.getNext();
        }

        System.out.println("Total Bags: " + totalBags);
        System.out.println("Total VIP Bags: " + totalVIPBags);
        System.out.println("Total Weight: " + totalWeight + " kg");

    }

    public void printDetails(){
        Node currentNode = head;

        while (currentNode != null) {
            Baggage bag = currentNode.getBaggage();
            System.out.println("Flight Number: " + bag.getflightNumber());
            System.out.println("Weight: " + bag.getKg() + " kg");
            System.out.println("Size: " + bag.getbagSize() + " cm");
            System.out.println("VIP: " + (bag.getVIP() ? "Yes" : "No"));
            System.out.println(); // Add a line break between bags

            currentNode = currentNode.getNext();
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
                    head = currentNode.getNext();
                    head.setPrev(null);
                } else if (currentNode == tail) {
                    // If the bag is at the tail
                    tail = currentNode.getPrev();
                    tail.setNext(null);
                } else {
                    // If the bag is in the middle
                    Node prevNode = currentNode.getPrev();
                    Node nextNode = currentNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                }

                bagsLoaded++;
            }

            currentNode = currentNode.getNext();
        }

        System.out.println("Loaded " + bagsLoaded + " bags with flight number " + flightNumber);

    }
    public void removeOverSize(float maxSize) {
        Node currentNode = head;
        int bagsRemoved = 0;

        while (currentNode != null) {
            if (currentNode.getBaggage().getbagSize() > maxSize) {
                // Found a bag that exceeds the maximum size, remove it from the list
                if (currentNode == head && currentNode == tail) {
                    // If there's only one bag in the list
                    head = tail = null;
                } else if (currentNode == head) {
                    // If the bag is at the head
                    head = currentNode.getNext();
                    head.setPrev(null);
                } else if (currentNode == tail) {
                    // If the bag is at the tail
                    tail = currentNode.getPrev();
                    tail.setNext(null);
                } else {
                    // If the bag is in the middle
                    Node prevNode = currentNode.getPrev();
                    Node nextNode = currentNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                }

                bagsRemoved++;
            }

            currentNode = currentNode.getNext();
        }

        System.out.println("Removed " + bagsRemoved + " bags over size " + maxSize + " cm");
    }

}
