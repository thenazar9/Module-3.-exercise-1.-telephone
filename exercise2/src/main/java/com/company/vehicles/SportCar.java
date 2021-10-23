package com.company.vehicles;

import com.company.detailsі.Engine;

import java.sql.Driver;

public class SportCar extends Car {
    private int maxSpeed;
    public void setMaxSpeed(int sportCarMaxSpeed){
        maxSpeed = sportCarMaxSpeed;
    }
public int getMaxSpeed(){
        return maxSpeed;
}

    public SportCar(String brand, String carClass, int weight, Engine engine, Driver driver, int maxSpeed) {
        super(brand, carClass, weight, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "maximum speed = " + maxSpeed + " km/h, " + super.toString();
    }
}
