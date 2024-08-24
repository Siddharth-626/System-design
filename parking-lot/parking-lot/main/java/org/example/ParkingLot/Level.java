package org.example.ParkingLot;

import org.example.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private  final List<parkingSpot> parkingSpots;

    public Level(int floor, int numberOfSpots) {
        this.floor = floor;
        this.parkingSpots = new ArrayList<>(numberOfSpots);
        for (int i = 0; i < numberOfSpots; i++) {
            parkingSpots.add(new parkingSpot(i));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (parkingSpot spot : parkingSpots) {
            if(spot.isAvailable()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for (parkingSpot spot : parkingSpots) {
            if(!spot.isAvailable()){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }

    public void displayAvailability(){
        System.out.println("Level" + floor + "Availabilty");
        for (parkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getSpotnumber() + ": " + (spot.isAvailable() ? "Available" : "Occupied"));
        }
    }
}
