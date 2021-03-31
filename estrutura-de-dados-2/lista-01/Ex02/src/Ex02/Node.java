package Ex02;

public class Node {
    private int value;
    private Node nextValue;
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public Node getNextValue() {
        return this.nextValue;
    }
    
    public void setNextValue(Node nextValue) {
        this.nextValue = nextValue;
    }
}
