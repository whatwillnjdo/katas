package com.tdd.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertTrue;

public class IntegerStackTest {
    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void shouldBeEmptyByDefault() throws Exception {
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test
    public void shouldPushOne() throws Exception {
        stack.push(1);
        assertTrue("Stack should be size 1",stack.size() == 1);
    }

    @Test
    public void shouldPushOnePopOnek() throws Exception {
        stack.push(1);
        assertTrue("Value popped from Stack should be 1",stack.pop() == 1);
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test
    public void shouldPushTwoPopTwo() throws Exception {
        stack.push(1);
        stack.push(2);
        assertTrue("Stack should be size 2",stack.size() == 2);
        assertTrue("Value popped from Stack should be 2",stack.pop() == 2);
        assertTrue("Value popped from Stack should be 1",stack.pop() == 1);
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test(expected = UnderflowException.class)
    public void shouldUnderflowWhenEmpty() throws Exception {
        stack.pop();
    }

    @Test
    public void shouldPeekWithoutRemovingValue() throws Exception {
        stack.push(1);
        assertTrue("Peek should be 1", stack.peek() == 1);
        assertTrue("Stack should be size 1",stack.size() == 1);
    }

    @Test(expected = EmptyStackException.class)
    public void shouldThrowEmptyStackWhenEmpty() throws Exception {
        stack.peek();
    }
}
