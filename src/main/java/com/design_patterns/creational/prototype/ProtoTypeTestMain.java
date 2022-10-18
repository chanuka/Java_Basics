package com.design_patterns.creational.prototype;

public class ProtoTypeTestMain {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Car car = (Car) registry.getVehicle(VehicleType.CAR);

        System.out.println(car+" - " + car.hashCode());

        car.setType("Lux");
        System.out.println(car+" - " + car.hashCode());

        Car car2 = (Car) registry.getVehicle(VehicleType.CAR);
        System.out.println(car2 +" - " + car2.hashCode());
    }
}
