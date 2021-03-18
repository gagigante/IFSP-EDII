package Ex03;

public class Node {
    private int value;
    private Node previousValue;
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public Node getPreviousValue() {
        return this.previousValue;
    }
    
    public void setPreviousValue(Node previousValue) {
        this.previousValue = previousValue;
    }
}
