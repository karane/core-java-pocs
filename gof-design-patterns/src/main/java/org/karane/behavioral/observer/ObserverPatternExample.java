package org.karane.behavioral.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("New State 1"); // Notifies all observers
        subject.setState("New State 2"); // Notifies all observers
    }
}
