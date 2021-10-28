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

        Driver lorryDriver = new Driver(45, "California", "Tom", 19);
        Engine lorryEngine = new Engine(505, "USA");
        Lorry lorry = new Lorry("Mack Anthem", "D", 10400,
                lorryEngine, lorryDriver, 28);

        Driver sportDriver = new Driver(30, "Tokyo", "Dias", 7);
        Engine sportEngine = new Engine(280, "japan");
        SportCar sportCar = new SportCar( "Toyota Supra A80", "C", 1585,
                sportEngine, sportDriver, 241);

        Person person = new Person(25, "San Francisco");
car.start();
car.stop();
car.turnRight();
car.turnLeft();
        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);

    }
}
