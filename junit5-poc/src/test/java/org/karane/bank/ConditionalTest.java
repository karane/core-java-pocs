package org.karane.bank;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnWindows() {
        System.out.println("Runs only on Windows");
    }

    @Test
    @DisabledOnOs(OS.LINUX)
    void testDisabledOnLinux() {
        System.out.println("Disabled on Linux");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnJava17() {
        System.out.println("Runs on Java 17");
    }
}
