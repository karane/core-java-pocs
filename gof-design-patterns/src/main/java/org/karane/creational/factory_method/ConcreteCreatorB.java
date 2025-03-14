package org.karane.creational.factory_method;

class ConcreteCreatorB extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
