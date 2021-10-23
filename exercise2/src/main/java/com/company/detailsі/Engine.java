package com.company.detailsі;

import com.company.vehicles.Car;

import java.sql.Driver;

public class Engine {
    private int power;
    private String producer;

public void setPower(int enginePower){
    power = enginePower;
}
public int getPower(){
    return power;
}
public void setProducer(String engineProducer){
    producer = engineProducer;
}
public String getProducer(){
    return producer;
}

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return power + " h.p." +
                ", producer " + producer;
    }
}
