package com.example.behavioral_state_pattern.WithStatePattern;

public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode mode){
        this.transportationMode = mode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getETA(){
        return transportationMode.getETA();
    }

    public String getDirection(){
        return transportationMode.getDirection();
    }
}
