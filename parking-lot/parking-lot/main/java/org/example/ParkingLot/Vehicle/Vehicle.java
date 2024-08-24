package org.example.ParkingLot.Vehicle;

public class Vehicle {
    private final VehicleType vehicleType;
    private final String NumberPlate;

    public Vehicle(String NumberPlate,VehicleType vehicleType) {
       this.vehicleType = vehicleType;
       this.NumberPlate =NumberPlate;
    }

    public VehicleType getType(){
        return vehicleType;
    }


}





