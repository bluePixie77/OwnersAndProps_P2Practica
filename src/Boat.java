public class Boat extends Prop{

    // Atributs
    private float length;
    private boolean navegable;

    // Constructor
    public Boat(String propID, String address, String city, float price, float length, boolean navegable) {
        super(propID, address, city, price);
        this.length = length;
        this.navegable = navegable;
    }

    // Setters
    public void setLength(float length) {
        this.length = length;
    }
    public void setNavegable(boolean navegable) {
        this.navegable = navegable;
    }

    // Getters
    public float getLength() {
        return length;
    }
    public boolean isNavegable() {
        return navegable;
    }
}
