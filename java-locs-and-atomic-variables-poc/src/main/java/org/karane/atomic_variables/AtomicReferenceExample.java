package org.karane.atomic_variables;

import java.util.concurrent.atomic.AtomicReference;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class AtomicReferenceExample {
    private static final AtomicReference<User> userRef = new AtomicReference<>(new User("Alice", 30));

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> userRef.set(new User("Bob", 25)));
        Thread t2 = new Thread(() -> userRef.set(new User("Charlie", 35)));

        t1.start();
        t2.start();

        System.out.println("Final User: " + userRef.get());
    }
}
