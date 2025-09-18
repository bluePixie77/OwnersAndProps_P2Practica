public class Owner {

    // Atributs
    String name;
    String address;
    Prop[] props;
    int numProps;

    // Constructor
    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.numProps = 5;
        this.props = new Prop[numProps];
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
        float cP = props[1].getPrice();
        for(int i=0; i<numProps; i++){
            if(props[i].getPrice() < cP){
                cP = props[i].getPrice();
            }
        }
        return cP;
    }

    public float expensivePrice(){
        float eP = props[1].getPrice();
        for(int i=0; i<numProps; i++){
            if(props[i].getPrice() > eP){
                eP = props[i].getPrice();
            }
        }
        return eP;
    }

    public float averagePrices(){
        int sumP = 0;
        for(int i=0; i<numProps; i++){
            sumP += props[i].getPrice();
        }
        return (float)sumP/(float)numProps;
    }

    public String cheapestProp(){
        for(int i=0; i<numProps; i++){
            if(cheapestPrice() == props[i].getPrice()){
                return props[i].getPropID();
            }
        }
        return "Prop not found";
    }

    public void sort(int[] x){      // SORT BÀSIC (SABER)
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    int temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public void sortPropsByPrice(){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0; i<numProps-1; i++){
                if(props[i].getPrice() > props[i+1].getPrice()){
                    Prop temp = props[i];
                    props[i] = props[i+1];
                    props[i+1] = temp;
                    sorted = false;
                }
            }
        }

    }

}
