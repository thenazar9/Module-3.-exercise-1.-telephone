package com.company;

import com.company.detailsі.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Driver driver = new Driver();
        Lorry lorry = new Lorry();
        SportCar sportCar = new SportCar();
        Person person = new Person();
car.start();
car.stop();
car.turnRight();
car.turnLeft();
car.tostring();
engine.tostring();
driver.tostring();
lorry.setLoadCapacity();
sportCar.setMaxSpeed();
person.info();
    }
}
