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
    public void loadFlight(){

    }
    public void removeOverSize(){

    }
}
