package org.karane.structural.decorator.simple;

class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
