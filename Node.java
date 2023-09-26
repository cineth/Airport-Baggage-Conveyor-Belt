public class Node {
    public Baggage baggage;
    public Node next;
    public Node prev;

    public Node(Baggage baggage) {
        this.baggage = baggage;
        this.next = null;
        this.prev = null;
    }

    public Baggage getBaggage() {
        return baggage;
    }


}




