package com.example.behavioral_observer_pattern.WeatherStationExample;

class DisplayDevice {
    public void showTemp(float temp) {
        System.out.println("Current Temp: " + temp + " C");
    }
}

class WeatherStation {
    private float temp;
    private DisplayDevice displayDevice; // can be multiple such device

    public WeatherStation (DisplayDevice device){
        this.displayDevice = device;
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyObject();
    }

    public void notifyObject(){
        displayDevice.showTemp(temp);
    }
}



public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);

        station.setTemp(36);
        station.setTemp(43);
    }

}
