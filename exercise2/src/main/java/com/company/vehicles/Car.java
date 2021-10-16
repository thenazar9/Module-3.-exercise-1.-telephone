package com.company.vehicles;

import com.company.detailsі.Engine;
import com.company.professions.Driver;

public class Car {
    String brand = "Mercedes-Benz";
    String carClass= "S-Class";
    int weight = 2350;
    static Driver driver;
    static Engine engine;
    public void start(){
        System.out.println("Поїхали");
    }
    public void stop(){
        System.out.println("Зупиняємося");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот наліво");
    }
    public void tostring(){
        System.out.println(brand + ", " + carClass + ", " + weight + " k.g.");
    }
}
