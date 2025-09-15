public class Prop {

    // Atributs
    private String propID;
    private String address;
    private String city;
    private float price;


    // Constructor

    public Prop(String propID, String address, String city) {
        this.propID = propID;
        this.address = address;
        this.city = city;
        this.price = 0.0f;
    }

    // Setters
    public void setPropID(String propID) {
        this.propID = propID;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    // Getters
    public String getPropID() {
        return propID;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public float getPrice() {
        return price;
    }

    // Altres mètodes
     public boolean isCheaperThan(Prop p){
        //return p.price < p2.price; ?
         return false;
     }

     public boolean sameCity(Prop p){
        //return p.city == p2.city; ?
        return false;
     }

}
