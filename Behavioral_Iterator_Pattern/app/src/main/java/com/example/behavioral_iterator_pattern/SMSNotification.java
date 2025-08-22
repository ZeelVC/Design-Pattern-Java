package com.example.behavioral_iterator_pattern;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class SMSNotification implements NotificationCollection{

    private Queue<Notification> smsNotification;

    public SMSNotification(){
        smsNotification = new ArrayDeque<>();
    }

    public void addNotification(String message){
        smsNotification.add(new Notification(message));
    }


    @Override
    public Iterator<Notification> createIterator() {
        return new SMSNotificationIterator(smsNotification);
    }

    private class SMSNotificationIterator implements Iterator<Notification>{
        private Queue<Notification> notifications;

        public SMSNotificationIterator(Queue<Notification> notifications){
            this.notifications = notifications;
        }


        @Override
        public boolean hasNext() {
            return !notifications.isEmpty();
        }

        @Override
        public Notification next() {
            return notifications.poll();
        }
    }
}
