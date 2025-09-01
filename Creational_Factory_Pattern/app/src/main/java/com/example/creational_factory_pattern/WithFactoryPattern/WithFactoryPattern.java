package com.example.creational_factory_pattern.WithFactoryPattern;

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

class TransportFactory {
    public static Transport createTransport(String type){
        switch(type.toLowerCase()){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "bus":
                return new Bus();
            default:
                throw new IllegalArgumentException("Unsupported transport type");
        }
    }
}

public class WithFactoryPattern {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.createTransport("Car");
        vehicle.deliver();
    }
}
