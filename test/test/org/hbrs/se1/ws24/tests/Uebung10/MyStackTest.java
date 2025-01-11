package test.org.hbrs.se1.ws24.tests.Uebung10;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;

import org.hbrs.se1.ws24.exercises.uebung10.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    private MyStack<Integer> stack;

    @BeforeEach
    public void setUp() {
    }

    @Test
    void testIsEmpty() {
        stack = new MyStack<>(1);
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek() {
        stack = new MyStack<>(1);
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void testEmptypeek() {
        stack = new MyStack<>(1);
        assertEquals(null, stack.peek());
    }

    @Test
    void testPop() {
        stack = new MyStack<>(1);
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testEmptyPop() {
        stack = new MyStack<>(1);
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testPush() {
        stack = new MyStack<>(2);
        stack.push(null);
    }

    @Test
    void testSize() {

    }
}
