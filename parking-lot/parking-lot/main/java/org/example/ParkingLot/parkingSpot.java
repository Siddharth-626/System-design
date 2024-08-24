package org.example.ParkingLot;

import org.example.ParkingLot.Vehicle.Vehicle;
import org.example.ParkingLot.Vehicle.VehicleType;

public class parkingSpot {
    private int spotnumber;
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;

    public parkingSpot(int spotnumber) {
        this.vehicleType = VehicleType.CAR;
        this.spotnumber = spotnumber;
    }

    public  synchronized boolean isAvailable(){
        return parkedVehicle == null;
    }
    public void parkVehicle(Vehicle vehicle){
       if (isAvailable()){
           parkedVehicle = vehicle;
           System.out.print("parked vehicle");
       } else {
           throw new IllegalArgumentException("Invalid vehicle type or spot already occupied.");
       }
    }
    public synchronized void unparkVehicle(){

        parkedVehicle = null;
    }
    public int getSpotnumber() {
        return spotnumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;

    }
}
