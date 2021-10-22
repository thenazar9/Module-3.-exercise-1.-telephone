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
        driver.setName("Bob");
        driver.setDrivingExperience(4);
        car.setBrand("Mercedes-Benz");
        car.setCarClass("S-Class");
        car.setWeight(2350);
        engine.setPower(612);
        engine.setProducer("germany");
        lorry.setLoadCapacity(7);
        sportCar.setMaxSpeed(250);
        person.setAge(25);
        person.setLives("San Francisco");
car.start();
car.stop();
car.turnRight();
car.turnLeft();
car.toString();
engine.toString();
lorry.toString();
sportCar.toString();
driver.toString();
person.toString();
        System.out.println(car);
        System.out.println(engine);
        System.out.println(lorry);
        System.out.println(sportCar);
        System.out.println(driver);
        System.out.println(person);

    }
}
