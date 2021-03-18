package Ex02;

public class PersonalQueue {   
    private int i = 0;
    private Node firstElement;
 
    public Node insertValue(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        
        if (this.isEmpty()) {
            this.firstElement = newNode;
            return newNode;
        }
        
        Node temp = this.firstElement;
        i = 0;
        
        while (temp != null) {
            if (temp.getNextValue() == null) {
                temp.setNextValue(newNode);
                break;
            }
            
            temp = temp.getNextValue();
            i++;
        }
        
        return newNode;
    }
    
    public Node remove() {
        if (isEmpty()) {
            throw new Error("A pilha está vazia");
        }
        
        this.firstElement = this.firstElement.getNextValue();
        
        return this.firstElement;
    }  
    
    public int searchValueIndex(int value) {        
        if (!isEmpty()) {           
            Node temp = this.firstElement;
            
            i = 0;
            
            while (temp != null) {
                if (temp.getValue() == value) {
                    return i;
                }
                
                temp = temp.getNextValue();
                i++;
            }
        }
        
        return -1;
    }
      
    public int getQuantity() {
        if (!isEmpty()){           
            Node temp = firstElement;
            i = 0;
            
            while (temp != null) {
                temp = temp.getNextValue();
                i++;
            }         
            
            return i;
        } 
        
        return -1;
    }
    
    public boolean isEmpty() {
        return firstElement == null;
    }
      
    public void printAllValues() {   
        if (this.isEmpty()) {
            throw new Error("A pilha está vazia");
        }

        Node temp = firstElement;
        i = 0;
        
        while (temp != null) {
            System.out.println(temp.getValue()+ " posição " + i);
            temp = temp.getNextValue();
            i++;
        }
    }
}

