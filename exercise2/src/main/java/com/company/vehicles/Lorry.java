package com.company.vehicles;

public class Lorry extends Car{
    private int loadCapacity;
public void setLoadCapacity(int lorryLoadCapacity){
    loadCapacity = lorryLoadCapacity;
}
public int getLoadCapacity(){
    return loadCapacity;
}

    @Override
    public String toString() {
        return "engine=" + engine + ", driver=" + driver +
                ", load capacity = " + loadCapacity + " tonnes, " + super.toString();
    }
}
