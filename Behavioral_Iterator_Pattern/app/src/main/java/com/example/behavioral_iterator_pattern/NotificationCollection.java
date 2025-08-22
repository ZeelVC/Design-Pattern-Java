package com.example.behavioral_iterator_pattern;

import java.util.Iterator;

public interface NotificationCollection {
    public Iterator<Notification> createIterator();
}
