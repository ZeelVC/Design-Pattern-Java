package com.example.behavioral_state_pattern.WithStatePattern;

public class Train implements TransportationMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Train)");
        return 11;
    }

    @Override
    public String getDirection() {
        return "Direction for Train";
    }
}
