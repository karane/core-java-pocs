package org.karane.behavioral.chain_of_responsability;

class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A processed request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
