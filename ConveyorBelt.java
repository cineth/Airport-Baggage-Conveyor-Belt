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

        Node current = head; //making new node current and then making it the head
        while (current != null) {
            totalBags++;
            totalWeight += current.getBaggage().getKg(); // Assuming getKg() returns the bag's weight in kg.
            if (current.getBaggage().getVIP()) { // Assuming getVIP() returns true for VIP bags.
                totalVIPBags++;
            }
            current = current.getNext();
        }

        System.out.println("Total Bags: " + totalBags);
        System.out.println("Total VIP Bags: " + totalVIPBags);
        System.out.println("Total Weight: " + totalWeight + " kg");

    }

    public void printDetails(){
        Node current = head;

        while (current != null) {
            Baggage bag = current.getBaggage();
            System.out.println("Flight Number: " + bag.getflightNumber());
            System.out.println("Weight: " + bag.getKg() + " kg");
            System.out.println("Size: " + bag.getbagSize() + " cm");
            System.out.println("VIP: " + (bag.getVIP() ? "Yes" : "No"));
            System.out.println(); // Add a line break between bags

            current = current.getNext();
        }
    }
    public void loadFlight(){

    }
    public void removeOverSize(){

    }
}
