package org.example;

import org.example.ParkingLot.Level;
import org.example.ParkingLot.Vehicle.Car;
import org.example.ParkingLot.Vehicle.Vehicle;
import org.example.ParkingLot.Vehicle.bike;
import org.example.ParkingLot.Vehicle.truck;
import org.example.ParkingLot.parkingLot;

public class Main {
    public static void main(String[] args) {
        parkingLot pl = parkingLot.getInstance();

        Level l1 = new Level(1,10);


        pl.addLevel(l1);

        Vehicle car = new Car("TN31CF0154");
        Vehicle bike = new bike("TN31CF0254");
        Vehicle truck = new truck("tn23at1616");

        pl.parkVehicle(car);
        pl.parkVehicle(bike);
        pl.parkVehicle(truck);

        pl.displayAvailability();


        pl.unparkVehicle(bike);

        pl.displayAvailability();
    }
}