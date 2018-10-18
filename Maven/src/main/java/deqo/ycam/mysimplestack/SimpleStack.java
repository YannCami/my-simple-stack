package deqo.ycam.mysimplestack;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * Null item is allowed.
     */
    public void push(Item item);

    /**
     * Looks at the item at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     */
    public Item pop() throws EmptyStackException;
}
