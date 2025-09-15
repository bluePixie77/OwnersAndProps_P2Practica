public class House extends Prop{

    // Atributs
    private int numRooms;
    private boolean swimmingpool;

    // Constructor
    public House(String propID, String address, String city, float price, int numRooms, boolean swimmingpool) {
        super(propID, address, city, price);
        this.numRooms = numRooms;
        this.swimmingpool = swimmingpool;
    }

    // Setters
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }
    public void setSwimmingpool(boolean swimmingpool) {
        this.swimmingpool = swimmingpool;
    }

    // Getters
    public int getNumRooms() {
        return numRooms;
    }
    public boolean isSwimmingpool() {
        return swimmingpool;
    }

    // Altres mètodes
}
