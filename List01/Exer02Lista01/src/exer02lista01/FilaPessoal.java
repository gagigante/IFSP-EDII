package exer02lista01;

public class FilaPessoal {   
    int i = 0;
    Node firstElement;
 
    public void insertValue(int value) {
        if (this.isEmpty()) {
            Node node = new Node();
            node.setValue(value);
        
            this.firstElement = node;
            return;
        }
        
        // TODO
    }
    
    public void remover()
    {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        
        this.firstElement = this.firstElement.getNextValue();
    }  
    
    public void searchValue(int value)
    {        
        if (!isEmpty()) {           
            Node temp = this.firstElement;
            
            i = 0;
            
            while (temp != null) {
                if (temp.getValue() == value) {
                    System.out.println(i);
                    return;
                }
                
                temp = temp.getNextValue();
                i++;
            }
            
            System.out.println("-1");
            return;
        }
        
        System.out.println("-1");
    }
    
    public void printQuantity() 
    {
        if (!isEmpty()){           
            Node temp = firstElement;
            i = 0;
            while (temp != null) {
                i++;
                temp = temp.primeiroValor;
            }            
            System.out.println("Quantidade: " + i);
        } else {
            System.out.println("-1");
        }
    }
 

    public void imprimeTodosValores()
    {        
        if (!isEmpty()){           
            Node temp = firstElement;
            i = 0;
            while (temp != null) {
                System.out.println(temp.ultimoValor + " posição " + i);
                temp = temp.primeiroValor;
                i++;
            }
        } else {
            System.out.println("Pilha Vazia");
        }
    }
    
    public boolean isEmpty() {
        return firstElement == null;
    }
}

