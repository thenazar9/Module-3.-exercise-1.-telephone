package com.company.vehicles;

import com.company.detailsі.Engine;

import java.sql.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Engine engine;
    private Driver driver;
    public Car(String brand, String carClass, int weight, Engine engine, Driver driver) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public Engine getEngine(Engine engine){
        return engine;}
public void setEngine(){
        this.engine = engine;}

    public Driver getDriver(Driver driver) {
        return driver;}
    public void setDriver(){
        this.driver = driver;}


    public void setBrand(String carBrand) {
        brand = carBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCarClass(String carCarClass) {
        carClass = carCarClass;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setWeight(int carWeight) {
        weight = carWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void start() {
        System.out.println("Поїхали");
    }

    public void stop() {
        System.out.println("Зупиняємося");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот наліво");
    }


    @Override
    public String toString() {
        return  brand + ", " + carClass +
                ", " + weight + " k.g." + ", "+
                  engine + ", " +
                  driver;

    }

}
