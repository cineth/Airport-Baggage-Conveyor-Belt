public class Baggage {
    public int flightNumber; //store the flight number
    public float bagKg; //  representing weight in kg
    public float bagSize; // representing the sum of length+width+height in cm)
    public boolean VIP; // high priority bag

    public Baggage(){
        // Initialize to default values
        this.flightNumber = 0;
        this.bagKg = 0;
        this.bagSize = 0;
        this.VIP = false;
    }

    // Constructor to initialize Bag
    public Baggage(int fn, float bk, float bs, boolean vp) {
        this.flightNumber = fn;
        this.bagKg = bk;
        this.bagSize = bs;
        this.VIP = vp;
    }

    // Flight Number Getter
    public int getflightNumber() {
        return flightNumber;
    }

    // Flight Number Setter
    public void setflightNumber(int newFN) {
        this.flightNumber = newFN;
    }

    // Weight of Bag Getter
    public float getKg() {
        return bagKg;
    }

    // Weight of Bag Setter
    public void setKg(float newKg) {
        this.bagKg = newKg;
    }

    // Bag Dimensions Getter
    public float bagSize() {
        return bagSize;
    }

    // Bag Dimensions Setter
    public void bagSize(float newSize) {
        this.bagSize = newSize;
    }





}
