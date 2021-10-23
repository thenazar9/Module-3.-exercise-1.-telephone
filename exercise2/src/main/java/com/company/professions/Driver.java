package com.company.professions;

import com.company.detailsі.Engine;
import com.company.vehicles.Car;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class Driver implements java.sql.Driver {
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

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }


    @Override
    public String toString() {
        return name +  ", driving experience " + drivingExperience + " years" ;
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
