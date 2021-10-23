package com.company.vehicles;

import com.company.detailsі.Engine;

import java.sql.Driver;

public class Lorry extends Car{
    private int loadCapacity;

public void setLoadCapacity(int lorryLoadCapacity){
    loadCapacity = lorryLoadCapacity;
}
public int getLoadCapacity(){
    return loadCapacity;
}


    public Lorry(String brand, String carClass, int weight, Engine engine, Driver driver, int loadCapacity) {
        super(brand, carClass, weight, engine, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return  "load capacity = " + loadCapacity + " tonnes, " + super.toString();
    }
}
