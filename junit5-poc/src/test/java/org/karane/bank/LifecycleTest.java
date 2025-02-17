package org.karane.bank;

import org.junit.jupiter.api.*;

class LifecycleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Runs once before all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Runs before each test");
    }

    @Test
    void testOne() {
        System.out.println("Test 1 running");
    }

    @Test
    void testTwo() {
        System.out.println("Test 2 running");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs after each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Runs once after all tests");
    }
}
