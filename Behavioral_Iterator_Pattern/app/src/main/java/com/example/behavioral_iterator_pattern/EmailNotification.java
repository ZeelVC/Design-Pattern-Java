package com.example.behavioral_iterator_pattern;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmailNotification implements NotificationCollection{
    private List<Notification> emailNotification;
    public EmailNotification() {
        emailNotification = new ArrayList<>();
    }

    public void addNotification(String message){
        emailNotification.add(new Notification(message));
    }


    @Override
    public Iterator<Notification> createIterator() {
        return new EmailNotificationIterator(emailNotification);
    }

    private class EmailNotificationIterator implements Iterator<Notification>{
        private int position = 0;
        private List<Notification> notifications;

        public EmailNotificationIterator(List<Notification> notifications){
            this.notifications = notifications;
        }


        @Override
        public boolean hasNext() {
            return position < notifications.size();
        }

        @Override
        public Notification next() {
            return notifications.get(position++);
        }
    }
}
