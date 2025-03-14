package org.karane.creational.prototype;

class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.data);
    }

    public void showData() {
        System.out.println("Data: " + data);
    }
}
