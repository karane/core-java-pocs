package org.karane.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

class TimeoutTest {
    @Test
    void testExecutionTime() {
        assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(1000));
    }
}
