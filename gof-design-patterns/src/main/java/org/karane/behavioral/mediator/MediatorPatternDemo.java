package org.karane.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User user1 = new ConcreteUser(chatRoom, "Alice");
        User user2 = new ConcreteUser(chatRoom, "Bob");

        ((ChatRoom) chatRoom).addUser(user1);
        ((ChatRoom) chatRoom).addUser(user2);

        user1.sendMessage("Hello!");
    }
}
