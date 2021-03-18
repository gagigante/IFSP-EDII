package exer03lista01;

public class PilhaPessoal {
    int i = 0;
    Node top;
 
    public void adicionar(int x)
    {
        Node temp = new Node();
        
        temp.primeiroValor = x;
        temp.ultimoValor = top;
        top = temp;
    }
    
    public void remover()
    {
        if (isVazia()) {
            System.out.println("Pilha já está vazia");
            return;
        }
        
        top = (top).ultimoValor;
    }
    
    public void buscaValores(int x)
    {        
        if (!isVazia()){           
            Node temp = top;
            i = 0;
            while (temp != null) {
                if (temp.primeiroValor == x) {
                    System.out.println(i);
                }
                temp = temp.ultimoValor;
                i++;
            }
        } else {
            System.out.println("-1");
        }
    }
    
    public void imprimeQuantidade() 
    {
        if (!isVazia()){           
            Node temp = top;
            i = 0;
            while (temp != null) {
                i++;
                temp = temp.ultimoValor;
            }            
            System.out.println("Quantidade: " + i);
        } else {
            System.out.println("-1");
        }
    }
 
    public boolean isVazia()
    {
        return top == null;
    }
 
  
    public void todosValores()
    {        
        if (!isVazia()){           
            Node temp = top;
            i = 0;
            while (temp != null) {
                System.out.println(temp.primeiroValor + " posição " + i);
                temp = temp.ultimoValor;
                i++;
            }
        } else {
            System.out.println("Pilha Vazia");
        }
    }
}
