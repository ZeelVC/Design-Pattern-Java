package com.example.behavioral_iterator_pattern;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class NotificationManager {
    private NotificationCollection emailNotification;
    private NotificationCollection smsNotification;

    public NotificationManager(){
        emailNotification = new EmailNotification();
        smsNotification = new SMSNotification();
    }

    public void addEmailNotification(String message){
        ((EmailNotification)emailNotification).addNotification(message);
    }

    public void addSMSNotification(String message){
        ((SMSNotification)smsNotification).addNotification(message);
    }

    public void printallNotification(){
        printNotification(emailNotification.createIterator(), "Email");
        printNotification(smsNotification.createIterator(), "SMS");
    }

    private void printNotification (Iterator<Notification> iterator, String type){
        System.out.println(type + " Notifications: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getMessage());
        }
    }
}
