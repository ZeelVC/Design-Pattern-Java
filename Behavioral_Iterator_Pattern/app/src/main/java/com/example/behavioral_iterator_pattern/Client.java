package com.example.behavioral_iterator_pattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NotificationManager notificationManager = new NotificationManager();

        for(int i=0;i < 2;i++) {
            String emailNotification = sc.nextLine();
            String smsNotification = sc.nextLine();

            notificationManager.addEmailNotification(emailNotification);
            notificationManager.addSMSNotification(smsNotification);
        }

        notificationManager.printallNotification();


        sc.close();
    }
}
