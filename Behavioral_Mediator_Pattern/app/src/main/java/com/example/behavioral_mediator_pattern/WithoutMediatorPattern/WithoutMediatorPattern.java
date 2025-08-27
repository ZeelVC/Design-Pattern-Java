package com.example.behavioral_mediator_pattern.WithoutMediatorPattern;

import org.xml.sax.ext.DeclHandler;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage (String message, User recipient){
        System.out.println(this.name + " is sending " + message + " to " + recipient.getName());
    }
}
public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User Zeel = new User("Zeel");
        User Ayushi = new User("Ayushi");
        User Dhwani = new User("Dhwani");

        Zeel.sendMessage("Hello", Ayushi);
        Zeel.sendMessage("Hello", Dhwani);
    }
}
