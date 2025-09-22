public class Main {

    // Atributs o propietats
    public static Owner[] allOwners;
    public static int numOwners;
    public static int numProps;

    public static void main(String[] args) {


    }


    // Mètodes
    public static void addOwner(Owner owner){
        if(numOwners<allOwners.length){
            allOwners[numOwners] = owner;
            numOwners++;
        }
    }

    public static void addProp(String ownerName, Prop p){
        for(int i=0; i<numOwners; i++){
            Owner owner = allOwners[i]; // no fa falta passar array per paràmetre pq és static
            if(owner.getName().equals(ownerName)){  // name privat --> accedim a través del getter
                owner.addProp(p);
                numProps++;
            }
        }
    }

    public static int numPropsInCity(Owner[] owners, String city){
        int n=0;
        for(int i=0; i<numOwners; i++){
            Owner owner = owners[i];
            for(int j=0; j<owner.getNumProps(); j++){
                Prop p = owner.getProps()[j];
                if(p.getCity().equals(city)){
                    n++;
                }
            }
        }
        return n;
    }

    public static String ownerCheapestProp(Owner[] owners){
        float minAllOwners = Float.MAX_VALUE;
        String ownerName = "";
        for(int i=0; i<numOwners; i++){
            Owner owner = owners[i];
            float minOwner = owner.cheapestPrice();
            if(minOwner < minAllOwners){
                minAllOwners = minOwner;
                ownerName = owner.getName();
            }
        }
        return ownerName;
    }

    public static void extendPrices(Owner[] owners){
        float minPrice = Float.MAX_VALUE;
        float maxPrice = Float.MIN_VALUE;

        for(int i=0; i<numOwners; i++){
            Owner owner = owners[i];
            float minOwner = owner.cheapestPrice();
            if(minOwner < minPrice){
                minPrice = minOwner;
            }

            float maxOwner = owner.expensivePrice();
            if(maxOwner < maxPrice){
                maxPrice = maxOwner;
            }
        }

    }

    public static int numBoatsMinLength(float l, Owner[] owners){
        int n = 0;
        for(int i=0; i<owners.length; i++){
            Owner owner = owners[i];
            if(owner!=null){
                for(int j=0; j<owner.getNumProps(); j++){
                    Prop p = owner.getProps()[j];
                    if(p instanceof Boat){
                        if(((Boat)p).getLength()>=l){
                            n++;
                        }
                    }
                }
            }
        }
        return n;
    }

    public static int numHousesWithPool(Owner[] owners) {
        int n = 0;
        for (int i = 0; i < numOwners; i++) {
            Owner owner = owners[i];
            for (int j = 0; j < owner.getNumProps(); j++) {
                Prop p = owner.getProps()[j];
                if (p instanceof House) {
                    if (((House) p).isSwimmingpool()) {
                        n++;
                    }
                }
            }
        }
        return n;
    }
}