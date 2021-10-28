public abstract class Phone implements PhoneConnection {
   private String name;
private String model;
private int storageCapacity;
private int amountOfRAM;

    public Phone(String name, String model, int storageCapacity, int amountOfRAM) {
        this.name = name;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.amountOfRAM = amountOfRAM;
    }
public void setName(String name){
        this.name = name;
}
public String getName(){
        return name;
}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    @Override
    public String toString() {
        return name +
                ", " + model  +
                ", storage capacity = " + storageCapacity +
                ", amount of RAM = " + amountOfRAM ;
    }
}

