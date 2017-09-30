package com.tdd.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringStackTest {
    public static final String APPLE = "apple";
    private Stack<String> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<>();
    }

    @Test(expected = UnderflowException.class)
    public void shouldTestUnderflow() throws Exception {
        stack.pop();
    }

    @Test
    public void shouldPushOne() throws Exception {
        stack.push(APPLE);
        assertEquals(stack.size(), 1);
    }

    @Test
    public void shouldPeekWithoutRemovingValue() throws Exception {
        stack.push(APPLE);
        assertTrue(stack.peek().equalsIgnoreCase(APPLE));
    }

    @Test
    public void shouldPushOneAndPopOne() throws Exception {
        stack.push(APPLE);
        assertTrue(stack.pop().equalsIgnoreCase(APPLE));
    }
}
