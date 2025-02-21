package org.karane.reflection;

import java.lang.reflect.*;

public class ProxyReflection {
    public static void run() {
        Greetable person = new Person("Alice", 30);
        Greetable proxyPerson = createProxy(person);

        System.out.println("Original toString(): " + person);
        System.out.println("Proxy toString(): " + proxyPerson);
        proxyPerson.greet();
    }

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T object) {
        return (T) Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new ConcreteInvocationHandler(object)
        );
    }
}
