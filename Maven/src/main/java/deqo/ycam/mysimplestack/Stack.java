package deqo.ycam.mysimplestack;

import java.util.EmptyStackException;

public class Stack implements SimpleStack {
    private Item head;
    private Stack tail;

    public Stack() {
        head = null;
        tail = null;
    }

    public Stack(Item h, Stack t) {
        head = h;
        tail = t;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int getSize() {
        return this.isEmpty() ? 0 : 1 + tail.getSize();
    }

    @Override
    public void push(Item item) {
        this.tail = new Stack(this.head, this.tail);
        this.head = item;
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        else return this.head;
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        Item ret = this.head;
        this.head = this.tail.head;
        this.tail = this.tail.tail;
        return ret;
    }
}
