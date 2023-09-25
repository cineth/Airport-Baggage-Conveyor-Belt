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
    public void checkBag(){

    }

}
