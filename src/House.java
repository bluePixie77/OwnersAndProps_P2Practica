public class House extends Prop{

    // Atributs o propietats
    private int numRooms;
    private boolean swimmingpool;

    // Constructor
    public House(String propID, String address, String city, int numRooms) {
        super(propID, address, city);
        this.numRooms = numRooms;
        this.swimmingpool = false;
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
    
}
