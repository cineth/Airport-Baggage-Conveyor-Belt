public class Baggage {
    private int flightNumber; //store the flight number
    private float bagKg; //  representing weight in kg
    private float bagSize; // representing the sum of length+width+height in cm)
    private boolean VIP; // high priority bag



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
    public float getbagSize() {
        return bagSize;
    }

    // Bag Dimensions Setter
    public void setbagSize(float newSize) {
        this.bagSize = newSize;
    }

    // High priority bag Getter
    public boolean getVIP() {
        return VIP;
    }

    //  High priority bag Setter
    public void setVIP(boolean newVIP) {
        this.VIP = newVIP;
    }

}
