package deqo.ycam.mysimplestack;

public class Item {
    private int value;

    public Item() {}

    public Item(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
