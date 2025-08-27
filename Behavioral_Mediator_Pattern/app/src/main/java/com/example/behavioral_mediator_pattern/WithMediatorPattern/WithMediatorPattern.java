package com.example.behavioral_mediator_pattern.WithMediatorPattern;


import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for(User user : users){
            if(user != sender){
                user.receiveMessage(msg, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
class User{
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " sending a msg " + msg);
        chatMediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, User sender){
        System.out.println(this.name + " received message: '" + msg + "' from " + sender.getName());
    }
}

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User Zeel = new User("Zeel", chatRoom);
        User Ayushi = new User("Ayushi", chatRoom);
        User Dhwani = new User("Dhwani", chatRoom);

        chatRoom.addUser(Zeel);
        chatRoom.addUser(Ayushi);
        chatRoom.addUser(Dhwani);

        Zeel.sendMessage("Hello");
    }
}
