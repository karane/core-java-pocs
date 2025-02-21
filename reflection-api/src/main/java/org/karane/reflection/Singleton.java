package org.karane.reflection;

class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }
}
