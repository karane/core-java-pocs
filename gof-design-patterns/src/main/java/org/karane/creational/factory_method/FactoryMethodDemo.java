package org.karane.creational.factory_method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        Product productA = creatorA.createProduct();
        Product productB = creatorB.createProduct();

        productA.use();
        productB.use();
    }
}
