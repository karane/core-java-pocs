package org.karane.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request(); // Outputs: Specific request in Adaptee
    }
}
