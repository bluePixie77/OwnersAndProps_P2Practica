public class Boat extends Prop{

    // Atributs
    private float length;
    private boolean navegable; // valor  per defecte de les variables booleanes és 'false'

    // Constructor
    public Boat(String propID, String address, String city, float length) {
        super(propID, address, city);
        this.length = length;
        this.navegable = true;
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
