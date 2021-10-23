package com.company;

import com.company.detailsі.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class main {
    public static void main(String[] args) {
        Driver driver = new Driver("Bob", 4);
        Engine engine = new Engine(612, "germany");
        Car car = new Car("Mercedes-Benz", "S-Class", 2350, engine, driver);
        Lorry lorry = new Lorry("Mercedes-Benz", "S-Class", 2350,
                engine, driver, 7);
        SportCar sportCar = new SportCar( "Mercedes-Benz", "S-Class", 2350,
                engine, driver, 250);
        Person person = new Person("Bob", 4, 25, "San Francisco");

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
