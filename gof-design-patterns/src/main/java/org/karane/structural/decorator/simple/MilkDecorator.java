package org.karane.structural.decorator.simple;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
