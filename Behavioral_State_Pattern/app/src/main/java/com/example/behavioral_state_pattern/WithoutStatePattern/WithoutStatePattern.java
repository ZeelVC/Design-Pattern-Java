package com.example.behavioral_state_pattern.WithoutStatePattern;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.Train);
        directionService.setTransportationMode(TransportationMode.Car);

        directionService.getETA();
        System.out.println(directionService.getDirection());
    }
}
