package com.company.professions;

import com.company.detailsі.Engine;
import com.company.vehicles.Car;

public class Driver {
    private String name;
    private int drivingExperience;
    public void setName(String driverName){
        name = driverName;
    }
    public String getName(){
        return name;
}
    public void setDrivingExperience(int driverDrivingExperience){
        drivingExperience = driverDrivingExperience;}
    public int getDrivingExperience(){
        return drivingExperience;
    }

    @Override
    public String toString() {
        return name +  ", driving experience " + drivingExperience + " years" ;
    }
}
