package com.driver;

public class Boat extends Vehicle{
    private int maxSpeed ;

    public Boat(String name , int maxSpeed){
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
