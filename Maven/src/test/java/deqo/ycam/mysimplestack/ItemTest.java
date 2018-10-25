package deqo.ycam.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void testGetValue() {
        Item item = new Item(58);
        assertEquals("The value should be equal to 58", item.getValue(), 58);
    }

    @Test
    public void testSetter() {
        Item item = new Item();
        assertEquals("The item should have a value of 0", item.getValue(), 0);
        item.setValue(-22);
        assertEquals("The item should now have a value of -22", item.getValue(), -22);
    }

}