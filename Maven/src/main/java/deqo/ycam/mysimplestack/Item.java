package deqo.ycam.mysimplestack;

public class Item {
    private int value;
    private String descriptor;

    public Item() {}

    public Item(String descriptor) {
        this.descriptor = descriptor;
    }

    public Item(String descriptor, int value) {
        this.value = value;
        this.descriptor = descriptor;
    }

    public Item(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getDescriptor() { return descriptor; }
}
