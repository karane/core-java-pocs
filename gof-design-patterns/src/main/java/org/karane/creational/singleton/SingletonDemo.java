package org.karane.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.showMessage();
        System.out.println("Are instances the same? " + (instance1 == instance2));
    }
}
