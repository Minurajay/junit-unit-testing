import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CounterTest {

    private final Counter counter = new Counter();

    @RepeatedTest(5)
    public void testIncrement() {
        int beforeIncrement = counter.getCount();
        int afterIncrement = counter.increment();
        assertEquals(beforeIncrement + 1, afterIncrement, "Counter should increment by 1");
    }
}
