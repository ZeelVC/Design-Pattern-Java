package com.example.behavioral_state_pattern.WithStatePattern;

public class Cycling implements TransportationMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Cycling)");
        return 2;
    }

    @Override
    public String getDirection() {
        return "Direction for Cycling";
    }
}
