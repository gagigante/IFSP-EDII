package Ex03;

public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalStack stack = new PersonalStack();

        stack.insert(10);
        stack.insert(20);
        stack.insert(30);
        stack.insert(40);
        
        System.out.println("Itens na pilha: " + stack.getQuantity());
        stack.printAllValues();
            
        stack.remove();
        
        System.out.println("Itens na pilha: " + stack.getQuantity());
        stack.printAllValues();
            
        stack.remove();
        
        System.out.println("Itens na pilha: " + stack.getQuantity());
        stack.printAllValues();
            
        System.out.println(stack.isEmpty() ? "Está vazia": "Não está vazia");
    }
    
}
