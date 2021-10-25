package com.company;

import com.company.detailsі.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class main {
    public static void main(String[] args) {
        Driver driver = new Driver(25, "San Francisco", "Bob", 4);
        Engine engine = new Engine(612, "germany");
        Car car = new Car("Mercedes-Benz", "S-Class", 2350, engine, driver);
        Lorry lorry = new Lorry("Mercedes-Benz", "S-Class", 2350,
                engine, driver, 7);
        SportCar sportCar = new SportCar( "Mercedes-Benz", "S-Class", 2350,
                engine, driver, 250);
        Person person = new Person(25, "San Francisco");
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
