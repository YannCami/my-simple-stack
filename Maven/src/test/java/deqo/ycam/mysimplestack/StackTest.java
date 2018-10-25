package deqo.ycam.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue("This stack is not empty. isEmpty() should return true.", stack.isEmpty());
    }

    @Test
    public void testGetSize() {
        Item item = new Item();
        Stack stack0 = new Stack();
        assertEquals("This stack is not empty, its size should be 0.", stack0.getSize(), 0);
        Stack stack1 = new Stack(item, stack0);
        assertEquals("This stack should be of size 1.", stack1.getSize(), 1);
        Stack stack2 = new Stack(item, stack1);
        assertEquals("This stack should be of size 2.", stack2.getSize(), 2);
    }

    @Test
    public void testPush() {
        Item item = new Item();
        Stack stack = new Stack();
        stack.push(item);
        assertFalse("This stack should no longer be empty.", stack.isEmpty());
        assertEquals("This stack should now be of size 1.", stack.getSize(), 1);
        stack.push(item);
        assertEquals("This stack should now be of size 2.", stack.getSize(), 2);
    }

    @Test(expected = EmptyStackException.class)
    public void testPeek() {
        Item item1 = new Item(3);
        Stack stack0 = new Stack();
        Stack stack = new Stack(item1, stack0);
        assertEquals("The first element of this stack should be 3.", stack.peek().getValue(), 3);
        Item item2 = new Item(7);
        stack.push(item2);
        assertEquals("The first element of this stack should now be 7.", stack.peek().getValue(), 7);
        stack0.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void testPop() {
        Item item1 = new Item(-14);
        Stack stack0 = new Stack();
        Stack stack = new Stack(item1, stack0);
        Item item2 = new Item(89);
        stack.push(item2);
        assertEquals("The first element removed from this stack should be 89.", stack.pop().getValue(), 89);
        assertEquals("The second element removed from this stack should be -14.", stack.pop().getValue(), -14);
        assertTrue("The stack should now be empty.", stack.isEmpty());
        stack.pop();
    }
}