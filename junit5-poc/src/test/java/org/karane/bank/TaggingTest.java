package org.karane.bank;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TaggingTest {

    @Test
    @Tag("fast")
    void fastTest() {
        System.out.println("Fast test running");
    }

    @Test
    @Tag("slow")
    void slowTest() {
        System.out.println("Slow test running");
    }

    @Test
    @Tag("integration")
    void integrationTest() {
        System.out.println("Integration test running");
    }
}
