package org.karane.creational.singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    } // Private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Accessed");
    }
}
