package org.karane.structural.adapter;

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Delegates the call to the adaptee's method
        System.out.print("\nAdapted request: \n\t{\n\t\t");
        adaptee.specificRequest();
        System.out.print("\t}\n");
    }
}
