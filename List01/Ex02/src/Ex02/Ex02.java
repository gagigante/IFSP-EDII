package Ex02;

public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalQueue queue = new PersonalQueue();
        
        queue.insertValue(10);
        queue.insertValue(20);
        queue.insertValue(30);
        queue.insertValue(40);
       
        System.out.println(queue.getQuantity());
        queue.printAllValues();
        
        queue.remove();
        
        System.out.println(queue.getQuantity());
        queue.printAllValues();
        
        queue.remove();
        
        System.out.println(queue.getQuantity());
        queue.printAllValues();
        
        System.out.println(queue.isEmpty() ? "Está vazia": "Não está vazia");
    }
    
}
