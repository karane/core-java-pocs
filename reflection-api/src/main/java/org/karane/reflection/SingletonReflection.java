package org.karane.reflection;

import java.lang.reflect.*;

public class SingletonReflection {
    public static void run() {
        try {

            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton newInstance = constructor.newInstance();

            System.out.println("Created Singleton instance via reflection: " + newInstance);
            System.out.println("Original Singleton instance: " + Singleton.getInstance());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

