package com.company.vehicles;

public class SportCar extends Car {
    private int maxSpeed;
    public void setMaxSpeed(int sportCarMaxSpeed){
        maxSpeed = sportCarMaxSpeed;
    }
public int getMaxSpeed(){
        return maxSpeed;
}

    @Override
    public String toString() {
        return "engine=" + engine + ", driver=" + driver +
                ", maximum speed = " + maxSpeed + " km/h, " + super.toString();
    }
}
