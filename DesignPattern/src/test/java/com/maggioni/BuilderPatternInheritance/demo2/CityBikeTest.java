package com.maggioni.BuilderPatternInheritance.demo2;

import org.junit.Test;

public class CityBikeTest {

    CityBike cityBike;
    Bicycle bicycle;
    Vehicle vehicle;

    @Test
    public void testCityBike() {

        cityBike = new CityBike.CityBikeBuilder()
                .withModel("my")
                .withSpeed(15)
                .withNumberOfWheels(2)
                .build();

         cityBike = new CityBike.CityBikeBuilder()
                 .withNumberOfWheels(3)
                 .withModel("ss")
                 .withSpeed(25)
                 .build();

        cityBike = new CityBike.CityBikeBuilder()
                .withSpeed(25)
                .withModel("ss")
                .withNumberOfWheels(3)
                .build();
    }

    @Test
    public void testBicycle() {
        vehicle = Bicycle.builder()
                .withNumberOfWheels(2)
                .withSpeed(15)
                .build();

        bicycle = new Bicycle.BicycleBuilder()
                .withNumberOfWheels(2)
                .withSpeed(25)
                .build();

        bicycle = new Bicycle.BicycleBuilder()
                .withSpeed(25)
                .withNumberOfWheels(2)
                .build();
    }

    @Test
    public void testVehicle() {
        vehicle = new Vehicle.VehicleBuilder()
                .withNumberOfWheels(2)
                .build();

        vehicle = new Bicycle.BicycleBuilder()
                .withNumberOfWheels(2)
                .build();
    }
}