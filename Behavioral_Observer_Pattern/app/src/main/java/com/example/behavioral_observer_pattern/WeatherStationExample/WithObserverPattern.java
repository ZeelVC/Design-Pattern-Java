package com.example.behavioral_observer_pattern.WeatherStationExample;


import android.database.Observable;
import android.mtp.MtpObjectInfo;

import java.util.ArrayList;
import java.util.List;

interface Object {
    void updatehere(float temp);
}


interface Subject {
    void attach(Object obj);
    void detach(Object obj);

    void notifyObject();
}

class WeatherStationc implements Subject{
    private float temperature;
    private List<Object> observerList;

    public WeatherStationc(){
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObject();
    }

    @Override
    public void attach(Object obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Object obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObject() {
        for(Object obs:observerList){
            obs.updatehere(temperature); //Run Time Polymorphism
        }
    }
}


class DisplayDevicehere implements Object {
    String Name;
    public DisplayDevicehere(String deviceName) {
        this.Name = deviceName;
    }

    @Override
    public void updatehere(float temperature){
        System.out.println("Current temp on " + Name + " is " + temperature);
    }
}

class mobileDevice implements Object {
    @Override
    public void updatehere(float temperature){
        System.out.println("Mobile temp is " + temperature);
    }
}
public class WithObserverPattern {
    public static void main(String[] args) {
        WeatherStationc station = new WeatherStationc();

        DisplayDevicehere device = new DisplayDevicehere("SamsungMobile");
        mobileDevice mobile = new mobileDevice();

        station.attach(device);
        station.attach(mobile);

        station.setTemperature(25);

        station.detach(mobile);

        station.setTemperature(45);
    }
}
