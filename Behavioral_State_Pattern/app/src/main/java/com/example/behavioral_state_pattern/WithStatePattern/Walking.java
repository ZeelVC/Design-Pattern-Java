package com.example.behavioral_state_pattern.WithStatePattern;

public class Walking implements TransportationMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Walking)");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Direction for walking.";
    }
}
