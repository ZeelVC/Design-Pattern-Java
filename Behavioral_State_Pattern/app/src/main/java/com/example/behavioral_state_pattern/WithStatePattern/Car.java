package com.example.behavioral_state_pattern.WithStatePattern;

public class Car implements TransportationMode{

    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Car)");
        return 3;
    }

    @Override
    public String getDirection() {
        return "Direction for driving.";
    }
}
