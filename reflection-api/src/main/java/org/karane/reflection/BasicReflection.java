package org.karane.reflection;

import java.lang.reflect.*;

public class BasicReflection {
    public static void run() {
        try {
            Person myObject = new Person("John", 25);
            System.out.println("\nBefore Reflection: " + myObject);

            // Access private fields
            Field nameField = Person.class.getDeclaredField("name");
            Field ageField = Person.class.getDeclaredField("age");

            nameField.setAccessible(true);
            ageField.setAccessible(true);

            // Modify private fields
            nameField.set(myObject, "Alice");
            ageField.set(myObject, 30);
            System.out.println("Modified with Reflection: " + myObject);

            // Invoke private method
            Method greetMethod = Person.class.getDeclaredMethod("greet");
            greetMethod.setAccessible(true);
            System.out.println("Invoked with Reflection: " + myObject);
            greetMethod.invoke(myObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

