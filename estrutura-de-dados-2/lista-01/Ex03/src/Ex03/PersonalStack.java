package Ex03;

public class PersonalStack {
    private int i = 0;
    private Node top;
 
    public Node insert(int value)
    {
        Node newNode = new Node();
        newNode.setValue(value);
        
        if (this.isEmpty()) {
            this.top = newNode; 
            return newNode;
        }
                
        newNode.setPreviousValue(this.top);
        this.top = newNode;
        
        return newNode;
    }
    
    public Node remove()
    {
        if (isEmpty()) {
            throw new Error("A pilha está vazia");
        }
        
        Node removedNode = this.top;
        
        this.top = this.top.getPreviousValue();
                
        return removedNode;
    }
    
    public int searchValueIndex(int value)
    {        
        if (!isEmpty()){           
            Node temp = this.top;
            i = 0;
            
            while (temp != null) {
                if (temp.getValue() == value) {
                    return i;
                }
                
                temp = temp.getPreviousValue();
                i++;
            }
        } 
        
        return -1;
    }
    
    public int getQuantity() 
    {
        if (!isEmpty()){           
            Node temp = this.top;
            i = 0;
            
            while (temp != null) {
                i++;
                temp = temp.getPreviousValue();
            }
            
            return i;
        } 
        
        return -1;
    }
 
    public boolean isEmpty()
    {
        return this.top == null;
    }
 
    public void printAllValues()
    {        
        if (!isEmpty()){           
            Node temp = this.top;
            i = 0;
            
            while (temp != null) {
                System.out.println(temp.getValue() + " posição " + i);
                temp = temp.getPreviousValue();
                i++;
            }
            
            return;
        } 
        
        System.out.println("Pilha Vazia");
    }
}
