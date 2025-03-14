package org.karane.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Original");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();

        prototype1.showData();
        prototype2.showData();
    }
}
