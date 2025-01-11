package test.org.hbrs.se1.ws24.tests.Uebung10;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hbrs.se1.ws24.exercises.uebung10.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    private MyStack<Integer> stack;

    @BeforeEach
    public void setUp() {
        // Test soll mit einem Stack von n=4 dürchgeführt werden
        stack = new MyStack<>(4);
    }

    @Test
    void testRoundTrip() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.pop();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        stack.push(3);
        assertEquals(stack.getMaxSize() - 1, stack.size());
        stack.push(4);
        assertThrows(IndexOutOfBoundsException.class, () -> stack.push(5));
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
    }

}
