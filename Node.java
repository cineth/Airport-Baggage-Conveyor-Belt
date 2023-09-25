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

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

}




