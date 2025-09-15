public class Owner {

    // Atributs
    String name;
    String address;
    Prop[] props;
    int numProps;

    // Constructor
    public Owner(String name, String address, int numProps) {
        this.name = name;
        this.address = address;
        this.numProps = numProps;
        this.props = new Prop[5];
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setProps(Prop[] props) {
        this.props = props;
    }
    public void setNumProps(int numProps) {
        this.numProps = numProps;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Prop[] getProps() {
        return props;
    }
    public int getNumProps() {
        return numProps;
    }

    // Altres mètodes
    public void addProp(Prop p){
        if(numProps<props.length){
            props[numProps] = p;
            numProps++;
        }
    }

    public float cheapestPrice(){
        return 0;
    }

    public float expensivePrice(){
        return 0;
    }

    public float averagePrices(){
        return 0;
    }

    public String cheapestProp(){
        return "";
    }

    public void sortPropsByPrice(){

    }

}
