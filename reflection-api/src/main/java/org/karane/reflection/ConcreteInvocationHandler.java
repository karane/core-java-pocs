package org.karane.reflection;

import java.lang.reflect.*;

public class ConcreteInvocationHandler implements InvocationHandler {
    private final Object target;

    public ConcreteInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Intercepted call: " + method.getName());

        // Modify behavior dynamically
        if (method.getName().equals("greet")) {
            System.out.println("Hello from the proxy!");
            return null;
        }

        return method.invoke(target, args);
    }
}
