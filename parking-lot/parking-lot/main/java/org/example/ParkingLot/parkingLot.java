package org.example.ParkingLot;

import org.example.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class parkingLot {
    private final List<Level> levels;
    private static parkingLot instance;

    private parkingLot() {

        this.levels = new ArrayList<Level>();
    }
     public static synchronized parkingLot getInstance(){
        if(instance == null){
            instance = new parkingLot();
        }
        return instance;
     }

     public void addLevel(Level level){
        levels.add(level);
     }

     public boolean parkVehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.parkVehicle(vehicle)){
                return true;
            }
        }
        return false;
     }

     public boolean unparkVehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.unparkVehicle(vehicle)){
                return true;

            }
        }
        return false;

     }

     public void displayAvailability(){
        for(Level level : levels){
            level.displayAvailability();
        }
     }

}
