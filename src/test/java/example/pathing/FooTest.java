package example.pathing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    public void testFoo() {
        String result = new Foo().foo("str");
        assertEquals(result, "Foo str");
    }
}
