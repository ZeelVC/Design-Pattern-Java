package com.example.structural_adapter_pattern;
interface NotificationService {
    void send(String to,String subject,String body);
}

class EmailNotificationService implements NotificationService {
    public void send(String to,String subject,String body){
        System.out.println("Sending Email to " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: "+body);
    }
}

class SendGridService {
    public void sendEmail(String recipient, String title, String content){
        System.out.println("Sending email via SendGrid to " + recipient);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}

class SendGridAdapter implements NotificationService{
    private SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService){
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        //Adapter Method -> convert parameters and calls to SendGrid Method
        sendGridService.sendEmail(to,subject,body);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");

        //NotificationService sendGridEmailService = new SendGridService();
        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");
    }
}
