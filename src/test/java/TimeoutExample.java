import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutExample {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testMethodShouldCompleteWithinFiveSeconds() throws InterruptedException {
        // Simulate a task that takes longer than the timeout
        Thread.sleep(4000); // Sleep for 6 seconds
    }
}
