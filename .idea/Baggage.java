public class Baggage {
    public int flightNumber; //store the flight number
    public float bagKg; //  representing weight in kg
    public float bagSize; // representing the sum of length+width+height in cm)

    public boolean VIP; // high priority bag

    // Getter
    public int getflightNumber() {
        return flightNumber;
    }

    // Setter
    public void setflightNumber(int newFN) {
        flightNumber = newFN;
    }

    // Getter
    public float getKg() {
        return flightNumber;
    }

    // Setter
    public void setKg(float newKg) {
        newKg = bagKg;
    }
}
