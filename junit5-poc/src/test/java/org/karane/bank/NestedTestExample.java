package org.karane.bank;

import org.junit.jupiter.api.*;

class NestedTestExample {

    @Test
    void outerTest() {
        System.out.println("Outer test");
    }

    @Nested
    class InnerTests {
        @Test
        void innerTest() {
            System.out.println("Inner test");
        }
    }
}
