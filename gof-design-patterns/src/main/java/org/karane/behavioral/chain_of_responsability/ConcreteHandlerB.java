package org.karane.behavioral.chain_of_responsability;

class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B processed request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
