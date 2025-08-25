package com.example.behavioral_state_pattern.WithStatePattern;

public class WithStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Car());

        directionService.setTransportationMode(new Cycling());
        directionService.getETA();
        System.out.println(directionService.getDirection());
    }
}
