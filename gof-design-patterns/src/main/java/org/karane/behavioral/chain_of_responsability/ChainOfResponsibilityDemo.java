package org.karane.behavioral.chain_of_responsability;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);

        handlerA.handleRequest("B"); // Processed by Handler B
    }
}
