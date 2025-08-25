package com.example.behavioral_state_pattern.WithoutStatePattern;

enum TransportationMode {
    Walking, Cycling, Car, Train
}

public class DirectionService{
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode){
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getETA(){
        switch (transportationMode){
            case Walking:
                System.out.println("Calculated ETA for walking is 10");
                return 10;
            case Cycling:
                System.out.println("Calculated ETA for cycling is 2");
                return 2;
            case Car:
                System.out.println("Calculated ETA for car is 3");
                return 3;
            case Train:
                System.out.println("Calculated ETA for Train is 11");
                return 11;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }
    }

    public String getDirection(){
        switch(transportationMode){
            case Walking:
                return "Directions for walking: Head north for 500 meters.";
            case Cycling:
                return "Directions for cycling: Take the bike lane on Elm Street.";
            case Car:
                return "Directions for driving: Use highway 50 towards downtown.";
            case Train:
                return "Directions for train: Board the Red Line at Central Station.";
            default:
                return "No directions available for the selected mode.";
        }
    }
}
