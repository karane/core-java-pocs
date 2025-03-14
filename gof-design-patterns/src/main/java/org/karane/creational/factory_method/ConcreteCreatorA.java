package org.karane.creational.factory_method;

class ConcreteCreatorA extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
