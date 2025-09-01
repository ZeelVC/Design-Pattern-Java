package com.example.creational_factory_pattern.WithoutFactoryPattern;

interface Transport {
    void deliver();
}

class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by car");
    }
}

class Bike implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver by bike");
    }
}

class Bus implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver by bus");
    }
}

public class WithoutFactoryPattern {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bike = new Bike();
        //add a bus object
        Transport bus = new Bus();
        car.deliver();
    }
}
