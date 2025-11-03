package com.driver;

public class Boat extends Vehicle{
    private int vehicleCapacity ;

    public Boat(String name , int vehicleCapacity){
        super(name);
        this.vehicleCapacity = vehicleCapacity;
    }
    public String getVehicleName(){
        return getName();
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }
}
