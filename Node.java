public class Node {
    public Baggage baggage; //here is the data component
    public Node next; //here is the link component
    public Node prev; //here is the link component

    public Node(Baggage baggage) {
        this.baggage = baggage;
        this.next = null;
        this.prev = null;
    }

    public Baggage getBaggage() {
        return baggage;
    }


}




