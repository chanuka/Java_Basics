package com.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<VehicleType,Vehicle> vehicles = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
            vehicle = (Vehicle)vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }

    private void initialize() {

        Car car = new Car();
        car.setType("Mini");
        car.setFuelType("Petrol");
        car.setEngineCapacity(1000);

        Bus bus = new Bus();
        bus.setNumberOfSeats(45);
        bus.setFuelType("Diesel");
        bus.setEngineCapacity(5000);

        vehicles.put(VehicleType.CAR,car);
        vehicles.put(VehicleType.BUS,bus);
    }
}
